FROM openjdk:12
WORKDIR usr/src
ADD ./target/routing-0.0.1-SNAPSHOT.jar routing-0.0.1-SNAPSHOT.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","routing-0.0.1-SNAPSHOT.jar"]


# FROM openjdk:12
# COPY . .
# EXPOSE 8082
# RUN apt install maven
# RUN mvn clean compile package -DskipTests
# ENTRYPOINT ["mvn","spring-boot","run"]
