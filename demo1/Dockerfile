FROM openjdk:8-jdk-alpine
ARG SERVICE_NAME
ARG SERVICE_VERSION
COPY ./build/libs/${SERVICE_NAME:?}-${SERVICE_VERSION:?}.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
