FROM openjdk:17-jdk-alpine

LABEL maintainer = "sparkium.pt"

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

# used so that there is no shell wrapping the java process
ENTRYPOINT ["java","-jar","/app.jar"]