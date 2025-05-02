# Etapa 1: Build del microservicio con Maven y Java 17
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Etapa 2: Imagen final con solo el JAR
FROM eclipse-temurin:17
WORKDIR /app
COPY --from=build /app/target/estudiante-service-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java","-jar","app-estudiante.jar"]