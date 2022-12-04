FROM openjdk:17-oracle
VOLUME /tmp
ADD target/spring-boot-mongodb-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]