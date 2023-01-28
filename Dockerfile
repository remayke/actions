FROM amazoncorretto:17
WORKDIR /app
COPY . .
ENTRYPOINT ./mvnw spring-boot:run
EXPOSE 8080