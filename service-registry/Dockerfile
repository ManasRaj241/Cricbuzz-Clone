# Use a lightweight JDK image
FROM openjdk:17-jdk-slim

# Set a working directory inside the container
WORKDIR /app

# Copy the built jar file into the container
COPY target/service-registry-0.0.1-SNAPSHOT.jar service-registry.jar

# Expose the port Eureka runs on
EXPOSE 8761

# Run the jar file
ENTRYPOINT ["java", "-jar", "service-registry.jar"]
