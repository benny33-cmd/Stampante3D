# Usa un'immagine con Java 17
# Fase 1: Compilazione con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -DskipTests

# Fase 2: Esecuzione
FROM eclipse-temurin:17-jdk
COPY --from=build /target/Stampante3D-1.0-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
