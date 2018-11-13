FROM maven:3.5.2-jdk-8-alpine AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM openjdk:8-jdk-alpine
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/is-it-their-birthday-0.0.1-SNAPSHOT.jar /opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080