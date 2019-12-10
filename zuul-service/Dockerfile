FROM openjdk:11
WORKDIR /src
ADD ./target/zuul-service-v1.0.0.jar /zuul-service/src/zuul-service-v1.0.0.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","/zuul-service/src/zuul-service-v1.0.0.jar"]