# Usa un'immagine con Java 17
FROM maven:3.8.4-openjdk-17 AS build
COPY . .
RUN mvn clean install

FROM openjdk:17-jdk-slim
COPY --from=build /target/Stampante3D-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
