<<<<<<< HEAD
=======

# Stage 1: Build the Maven project
>>>>>>> 9566700050ac3b8a7d1f6fb245a48f1ecbaa3340
FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

<<<<<<< HEAD
COPY pom.xml .
COPY src ./src

RUN mvn clean package

=======
# Copy Maven configuration
COPY pom.xml .

# Copy Java source and test files
COPY src ./src

# Compile, test and package the application
RUN mvn clean package

# Stage 2: Run the application
>>>>>>> 9566700050ac3b8a7d1f6fb245a48f1ecbaa3340
FROM eclipse-temurin:17-jre

WORKDIR /app

<<<<<<< HEAD
COPY --from=build /app/target/classes ./classes

ENTRYPOINT ["java", "-cp", "classes", "com.example.GradeCalculator"]
=======
# Copy compiled application classes
COPY --from=build /app/target/classes ./classes

# Run the GradeCalculator application
ENTRYPOINT ["java", "-cp", "classes", "com.example.GradeCalculator"]
>>>>>>> 9566700050ac3b8a7d1f6fb245a48f1ecbaa3340
