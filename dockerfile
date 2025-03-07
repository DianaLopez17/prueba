FROM openjdk:17-jdk-alpine
VOLUME /tmp
COPY target/Autos-0.0.1-SNAPSHOT.jar Autos-0.0.1-SNAPSHOT.jar
ENTRYPOINT [ "java","-jar","/Autos-0.0.1-SNAPSHOT.jar"]