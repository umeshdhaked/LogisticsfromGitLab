FROM openjdk:11
WORKDIR config-service/src
ADD ./target/config-service-1.0.0-SNAPSHOT.jar /config-service/src/config-service-1.0.0-SNAPSHOT.jar
EXPOSE 8889
ENTRYPOINT ["java","-jar","/config-service/src/config-service-1.0.0-SNAPSHOT.jar"]
