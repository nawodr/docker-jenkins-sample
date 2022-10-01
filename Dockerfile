FROM openjdk:11
ADD target/docker-jenkin-sample.jar docker-jenkin-sample.jar
EXPOSE 8090
ENTRYPOINT ["java","-jar","docker-jenkin-sample.jar"]
