# define base docker image
FROM openjdk:11
LABEL maintainer="Mohamed S. El-Shall"
ADD target/department-service-0.0.1-SNAPSHOT.jar department-service.jar
ENTRYPOINT ["java", "-jar", "department-service.jar"]