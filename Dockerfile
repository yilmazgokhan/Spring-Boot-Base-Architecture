FROM adoptopenjdk/openjdk11:latest

COPY ./target/architecture-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch architecture-0.0.1-SNAPSHOT.jar'

ARG JAR_FILE=target/spring-boot-base-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java","-jar","architecture-0.0.1-SNAPSHOT.jar"]