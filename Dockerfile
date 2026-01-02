FROM gradle:8-jdk21 AS toolchain
COPY --chown=gradle:gradle . /home/gradle/project
WORKDIR /home/gradle/project
RUN gradle build


FROM eclipse-temurin:21
COPY --from=toolchain /home/gradle/project/build/libs/is-it-their-birthday-0.0.3-SNAPSHOT.jar /opt/is-it-their-birthday-0.0.3-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/opt/is-it-their-birthday-0.0.3-SNAPSHOT.jar"]
EXPOSE 8080
