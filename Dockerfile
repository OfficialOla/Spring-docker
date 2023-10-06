FROM openjdk:17
WORKDIR /opt
ENV PORT 8080
EXPOSE 8080
COPY target/*.jar /opt/app.jar
#ADD target/spring-docker-tutorial.jar spring-docker-tutorial.jar
ENTRYPOINT exec java $JAVA_OPTS -jar app.jar
#ENTRYPOINT ["java","-jar","/spring-docker-tutorial.jar"]
