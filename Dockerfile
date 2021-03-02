FROM openjdk:13
VOLUME /tmp
EXPOSE 8080
ADD ./target/FirstDevopsJob-0.0.1-SNAPSHOT.jar  FirstDevopsJob.jar
ENTRYPOINT ["java","-jar" ,"/FirstDevopsJob.jar"]