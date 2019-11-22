FROM openjdk:latest
WORKDIR /src
ADD ./target/retailer-registration-v1.0.0.jar /retailer-registrations/src/retailer-registration-v1.0.0.jar
EXPOSE 8088
ENTRYPOINT ["java","-jar","/retailer-registrations/src/retailer-registration-v1.0.0.jar"]