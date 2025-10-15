FROM openjdk:17-jdk-slim as build
COPY . /app
WORKDIR /app
RUN ./mvnw clean package

FROM openjdk:17-jdk-slim
COPY --from=build /app/target/*.jar /app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]


 