FROM eclipse-temurin:17
COPY target/produceJar.jar producerJar.jar
CMD ["java", "-jar", "producerJar.jar"]