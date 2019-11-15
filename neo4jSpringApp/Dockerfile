FROM openjdk:latest
WORKDIR neo4jSpringApp/src
ADD ./target/neo4j-1.0.0-SNAPSHOT.jar /neo4jSpringApp/src/neo4j-1.0.0-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/neo4jSpringApp/src/neo4j-1.0.0-SNAPSHOT.jar"]
