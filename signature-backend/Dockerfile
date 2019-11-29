FROM openjdk:latest
WORKDIR /src
ADD ./target/signature-backend-v1.0.0.jar /signature-backend/src/signature-backend-v1.0.0.jar
EXPOSE 9095
ENTRYPOINT ["java","-jar","/order-service/src/signature-backend-v1.0.0.jar"]
