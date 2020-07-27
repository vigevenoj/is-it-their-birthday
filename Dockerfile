FROM maven:3.6.3-adoptopenjdk-11 AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package

FROM adoptopenjdk:11-jre-hotspot
COPY --from=MAVEN_TOOL_CHAIN /tmp/target/is-it-their-birthday-0.0.1-SNAPSHOT.jar /opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080
