# define base docker image
FROM openjdk:11
LABEL maintainer="Mohamed S. El-Shall"
ADD target/service-registrty-0.0.1-SNAPSHOT.jar service-registrty.jar
ENTRYPOINT ["java", "-jar", "service-registrty.jar"]