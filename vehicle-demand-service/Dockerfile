FROM openjdk:latest
WORKDIR /src
ADD ./target/vehicledemand-v1.0.0.jar /order-service/src/vehicledemand-v1.0.0.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","/vehicledemand/src/vehicledemand-v1.0.0.jar"]