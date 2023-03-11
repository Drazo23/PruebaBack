FROM amazoncorretto:11-alpine-jdk
MAINTAINER DAI
COPY target/dai-0.0.1-SNAPSHOT.jar dai-0.0.1-SNAPSHOT.jar 
ENTRYPOINT["java","-jar","dai-0.0.1-SNAPSHOT.jar"]