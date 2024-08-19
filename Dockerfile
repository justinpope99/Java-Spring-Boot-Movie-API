FROM openjdk:21
WORKDIR /app
COPY ./target/movie-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080
CMD ["java", "-jar", "movie-0.0.1-SNAPSHOT.jar"]