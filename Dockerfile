FROM openjdk:17-jdk-alpine

ADD target/Hello.jar hello.jar

ENTRYPOINT ["java", "-jar","hello.jar"]