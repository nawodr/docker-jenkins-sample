FROM openjdk:11
EXPOSE 8090
ADD target/docker-jenkins-sample.jar docker-jenkins-sample.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-sample.jar"]