# define base docker image
FROM openjdk:11
LABEL maintainer="Mohamed S. El-Shall"
ADD target/hystrix-dashboard-0.0.1-SNAPSHOT.jar hystrix-dashboard.jar
ENTRYPOINT ["java", "-jar", "hystrix-dashboard.jar"]