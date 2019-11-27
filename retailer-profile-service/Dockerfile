FROM openjdk:latest
WORKDIR /src
ADD ./target/user-service-v1.0.0.jar /user-service/src/user-service-v1.0.0.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/user-service/src/user-service-v1.0.0.jar"]