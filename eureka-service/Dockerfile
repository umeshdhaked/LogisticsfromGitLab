FROM openjdk:11
WORKDIR eureka-service/src
ADD ./target/eureka-service-1.0.0-SNAPSHOT.jar /eureka-service/src/eureka-service-1.0.0-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/eureka-service/src/eureka-service-1.0.0-SNAPSHOT.jar"]