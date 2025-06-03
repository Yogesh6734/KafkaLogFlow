FROM openjdk:17-jdk-alpine

# Add the JAR file (source, destination)
COPY target/kafkalogflow-0.0.1-SNAPSHOT.jar /app.jar

# Expose the port your app runs on (replace 8080 if needed)
EXPOSE 8080

# By default, just start the app. To use wait-for-it, override the command in docker-compose.yml.
entrypoint: ["sh", "-c", "apk add --no-cache curl && until curl kafka:9092; do echo waiting for kafka; sleep 2; done; java -jar /app.jar"]