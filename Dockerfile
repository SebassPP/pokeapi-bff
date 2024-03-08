FROM openjdk
COPY build/libs/bff-0.0.1-SNAPSHOT.jar app.jar
ENV PORT 8090
WORKDIR /app
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/app.jar", "--server.port=8090"]