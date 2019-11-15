FROM openjdk:11
WORKDIR zuul-service/src
ADD ./target/zuul-service-1.0.0-SNAPSHOT.jar /zuul-service/src/zuul-service-1.0.0-SNAPSHOT.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","/zuul-service/src/zuul-service-1.0.0-SNAPSHOT.jar"]