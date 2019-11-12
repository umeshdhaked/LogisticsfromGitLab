FROM openjdk:latest
WORKDIR usr/src
ADD ./target/neo4j-0.0.1-SNAPSHOT.jar /usr/src/neo4j-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/usr/src/neo4j-0.0.1-SNAPSHOT.jar"]
