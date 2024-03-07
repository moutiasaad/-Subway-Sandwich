
FROM openjdk:17-jdk-alpine


WORKDIR /app


COPY target/subway_sandwich-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"]
