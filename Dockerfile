FROM eclipse-temurin:17
COPY target/producerJar.jar producerJar.jar
CMD ["java", "-jar", "producerJar.jar"]