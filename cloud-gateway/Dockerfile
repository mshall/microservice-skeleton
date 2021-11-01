# define base docker image
FROM openjdk:11
LABEL maintainer="Mohamed S. El-Shall"
ADD target/cloud-gateway-0.0.1-SNAPSHOT.jar cloud-gateway.jar
ENTRYPOINT ["java", "-jar", "cloud-gateway.jar"]