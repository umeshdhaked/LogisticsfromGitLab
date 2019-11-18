FROM openjdk:latest
WORKDIR Wyssser-loginbackend/src
ADD ./target/wysserlogin-1.0.0-SNAPSHOT.jar /Wyssser-loginbackend/src/wysserlogin-1.0.0-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","/Wyssser-loginbackend/src/wysserlogin-1.0.0-SNAPSHOT.jar"]
