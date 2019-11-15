FROM adoptopenjdk/openjdk11:latest
WORKDIR backend-service/src
VOLUME /tmp
ADD target/backend-service-1.0.0-SNAPSHOT.jar /backend-service/src/backend-service-1.0.0-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/backend-service/src/backend-service-1.0.0-SNAPSHOT.jar"]
