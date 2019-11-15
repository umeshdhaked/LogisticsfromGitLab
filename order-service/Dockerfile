FROM openjdk:latest
WORKDIR order-service/src
ADD ./target/order-service-1.0.0-SNAPSHOT.jar /order-service/src/order-service-1.0.0-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/order-service/src/order-service-1.0.0-SNAPSHOT.jar"]