FROM openjdk:8

COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]