
# Microservices skeleton project!

  

This is a skeleton RESTful application relying mainly on **SpringBoot**.

Our application is doing the following

- Adding new departments 
-  Fetching departments 
- Adding new users 
- Fetching users alongside their departments        


  
  

# Technology stack used

  

- Spring boot
- Spring data
- Service Registry
- Config Server
- Hystrix 
- In-memory DB (**H2 DB**)
- Lombok
- Maven
- Zipkin
- Swagger API documentation
- Docker

  

## Project layers

  

-  ### Controller layer

This layer contains the RESTful endpoints, through which our configured endpoint can be consumed (**UserController**)

  

-  ### Service layer

This layer processed whats coming from the controller layer and then apply our business logic including calling the repository (database) layer.

  

-  ### Repository layer

This is the database layer dealing with database operations

- DepartmentRepository

## How to run project

  

Project is using maven. so, you can download the project, run the following command to generate the jar file which will be the executable one for us to run the project but make sure you have maven installed on your machine:

  

### Steps

First of all, make sure to install zipkin server on your local machine: 
This can be done through docker commands:
Make sure you have docker installed then:
```
docker pull openzipkin/zipkin
```

Then run the following command to start zipkin server: 
```
docker run -d -p 9411:9411 openzipkin/zipkin
```

Before going through the steps, microservices to be started in the following order:

- Service Registry
- Config Server
- API Gateway
- Hystrix
- Departments 
- Users

**Running steps as follows:**

1- Run the following command:
```
mvn clean install package
```

This command shall run the maven to delete the target directory and start building the project to be packaged in the form of jar as configured in *pom.xml* file

  

2- Navigate to **target** generated after running the above maven command, then you shall find a file named **service-registrty-1.0-SNAPSHOT.jar**

  

3- While you're inside the target directory, run the following command

  
```
java -jar service-registrty-1.0-SNAPSHOT.jar
```


  

4- Theres another way other than the above third command, by navigating to your project directory and run:

```

mvn spring-boot:run

```

  

5- If you want to run the test cases you can execute the following command:

  

     mvn test

6- To test the APIs you can use the postman collection in the same directory hierarchy              
           **Postman Collection**

  

## Further enhancement which could be done more

  

### 1- Add test coverage through the following:

       Add the following plugin to your pom.xml

  

       <reporting>

       <plugins>

       <plugin>

       <groupId>org.apache.maven.plugins</groupId>

       <artifactId>maven-surefire-report-plugin</artifactId>

       </plugin>

       <plugin>

       <groupId>org.apache.maven.plugins</groupId>

       <artifactId>maven-jxr-plugin</artifactId>

       </plugin>

       </plugins>

       </reporting>

  
  

  Then Run the following command:

  

     mvn site


### 3- Dockerizing the application