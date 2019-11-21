FROM openjdk:latest
WORKDIR /src
ADD ./target/retailer-registration-v1.0.0.jar /retailer-registration/src/retailer-registration-v1.0.0.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","/retailer-registration/src/retailer-registration-v1.0.0.jar"]