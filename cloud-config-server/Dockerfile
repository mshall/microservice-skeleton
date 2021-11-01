# define base docker image
FROM openjdk:11
LABEL maintainer="Mohamed S. El-Shall"
ADD target/cloud-config-server-0.0.1-SNAPSHOT.jar cloud-config-server.jar
ENTRYPOINT ["java", "-jar", "cloud-config-server.jar"]