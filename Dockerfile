FROM amazoncorretto:17
WORKDIR /app
COPY . .
ENV MINHA_ENV_VAR=spring
RUN ./mvnw clean
ENTRYPOINT ./mvnw spring-boot:run
EXPOSE 8080