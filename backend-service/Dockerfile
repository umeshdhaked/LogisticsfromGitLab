FROM adoptopenjdk/openjdk11:latest
WORKDIR usr/src
VOLUME /tmp
ADD target/wysser-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "app.jar"]
