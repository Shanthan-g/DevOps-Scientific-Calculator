FROM openjdk:8
COPY  ./target/miniproj-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "miniproj-1.0-SNAPSHOT-jar-with-dependencies.jar"]