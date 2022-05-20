FROM adoptopenjdk/openjdk11
# Get gradle distribution
COPY . .
ENV GRADLE_OPTS "-XX:+HeapDumpOnOutOfMemoryError -Xmx512m -Dfile.encoding=UTF-8"
RUN ./gradlew build -x test --no-daemon

# Stage 2, distribution container
RUN mv src/gateways/build/libs/app.jar /app.jar
RUN rm -rf src build gradle

CMD ["java", "-jar", "/app.jar"]
