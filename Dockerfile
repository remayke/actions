FROM amazoncorretto:17
EXPOSE 8080
WORKDIR /app
COPY . .
RUN ./mvnw clean
ENTRYPOINT ./mvnw spring-boot:run