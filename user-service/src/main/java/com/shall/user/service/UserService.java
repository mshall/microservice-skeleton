package com.shall.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.shall.user.entity.User;
import com.shall.user.repository.UserRepository;
import com.shall.user.vo.DepartmentVO;
import com.shall.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		log.info("UserService.saveUser -> Start");
		return userRepository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		log.info("UserService.getUserWithDepartment -> Start");
		ResponseTemplateVO vo = new ResponseTemplateVO();
		User user = userRepository.findByUserId(userId);

		DepartmentVO department = restTemplate
				.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(), DepartmentVO.class);

		vo.setUser(user);
		vo.setDepartment(department);

		return vo;
	}
}
