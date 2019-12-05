
FROM maven:3.5.2-jdk-8-alpine
# FROM openjdk:8
ADD ./target/routing-1.0.0.jar app.jar
# ADD ./pom.xml ./pom.xml
ADD . .
RUN pwd
# RUN java -XshowSettings:properties
COPY src/main/resources/lib/ /usr/lib/
COPY ./src/main/resources/ld-linux-x86-64.so.2 /usr/lib/
RUN ls /usr/lib/
RUN pwd
EXPOSE 8080
RUN mvn clean
# RUN mvn package -DskipTests
ENTRYPOINT ["java","-jar","app.jar"]



