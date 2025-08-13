# ===== Stage 1: Build the application =====
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
# Copy pom.xml first for dependency caching
COPY pom.xml .
RUN mvn dependency:go-offline
# Copy the source code
COPY src src
# Build the JAR (skip tests for faster builds)
RUN mvn clean package -DskipTests

# ===== Stage 2: Run the application =====
FROM eclipse-temurin:17-jdk
WORKDIR /app
# Copy only the built JAR from the build stage
COPY --from=build /app/target/bookstore-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
