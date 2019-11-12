FROM openjdk:11
WORKDIR usr/src
ADD ./target/configserver-0.0.1-SNAPSHOT.jar /usr/src/configserver-0.0.1-SNAPSHOT.jar
EXPOSE 8888
ENTRYPOINT ["java","-jar","/usr/src/configserver-0.0.1-SNAPSHOT.jar"]