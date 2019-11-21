FROM openjdk:latest
WORKDIR /src
ADD ./target/retailer-service-v1.0.0.jar /retailer-service/src/retailer-service-v1.0.0.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","/retailer-service/src/retailer-service-v1.0.0.jar"]