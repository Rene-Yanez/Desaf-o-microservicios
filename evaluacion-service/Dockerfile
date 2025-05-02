# Etapa 1: Build del proyecto con Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Ejecutar la app
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/evaluacion-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar","app.jar"]