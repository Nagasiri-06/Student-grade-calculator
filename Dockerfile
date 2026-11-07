
# Stage 1: Build the Maven project
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

# Copy Maven configuration
COPY pom.xml .

# Copy Java source and test files
COPY src ./src

# Compile, test and package the application
RUN mvn clean package

# Stage 2: Run the application
FROM eclipse-temurin:17-jre

WORKDIR /app

# Copy compiled application classes
COPY --from=build /app/target/classes ./classes

# Run the GradeCalculator application
ENTRYPOINT ["java", "-cp", "classes", "com.example.GradeCalculator"]
