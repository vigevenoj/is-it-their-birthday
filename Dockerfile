FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY target/is-it-their-birthday-0.0.1-SNAPSHOT.jar /opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/opt/is-it-their-birthday-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080