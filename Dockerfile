FROM amazoncorretto:11-alpine-jdk
MAINTAINER dai
COPY target/dai-0.0.1-SNAPSHOT.jar dai-app.jar
ENTRYPOINT ["java", "-jar", "dai-app.jar"]