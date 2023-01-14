FROM openjdk:8-alpine

COPY target/uberjar/dog-watch.jar /dog-watch/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/dog-watch/app.jar"]
