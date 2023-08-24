FROM openjdk:17-oracle
VOLUME /tmp
EXPOSE 8089
ARG JAR_FILE=target/springbot-application-demo-image.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
