FROM openjdk:11
WORKDIR usr/src
ADD ./target/eurekaserver-0.0.1-SNAPSHOT.jar /usr/src/eurekaserver-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/usr/src/eurekaserver-0.0.1-SNAPSHOT.jar"]