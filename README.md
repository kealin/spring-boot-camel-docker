# spring-boot-camel-docker
sample project for deploying camel with spring boot in docker

mvn install docker:build
docker run -it -p 8080:8080 lindqvist.kim/spring_camel:latest
