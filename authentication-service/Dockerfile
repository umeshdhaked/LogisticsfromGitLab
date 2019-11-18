FROM openjdk:latest
WORKDIR /src
ADD ./target/authentication-service-v1.0.0.jar /authentication-service/src/authentication-service-v1.0.0.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/authentication-service/src/authentication-service-v1.0.0.jar"]
