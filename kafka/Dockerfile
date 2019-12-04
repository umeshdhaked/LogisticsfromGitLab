FROM openjdk:12
WORKDIR usr/src
ADD ./target/spring_with_kafka-0.0.1-SNAPSHOT.jar spring_with_kafka-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","spring_with_kafka-0.0.1-SNAPSHOT.jar"]
