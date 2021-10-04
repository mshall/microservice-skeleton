package com.shall.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shall.user.entity.User;
import com.shall.user.service.UserService;
import com.shall.user.vo.ResponseTemplateVO;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", produces = "application/json; charset=UTF-8", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		log.info("UserController.saveUser -> Start");
		return userService.saveUser(user);
	}

	@RequestMapping(value = "/{id}", produces = "application/json; charset=UTF-8", method = RequestMethod.GET)
	public ResponseTemplateVO getUserWithDepartment(@PathVariable("id") Long userId) {
		log.info("UserController.getUserWithDepartment -> Start");
		return userService.getUserWithDepartment(userId);
	}

}