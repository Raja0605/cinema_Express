# FROM eclipse-temurin:17-jdk-alpine

# WORKDIR /app

# COPY target/ExpressCinema-0.0.1-SNAPSHOT.jar app.jar

# EXPOSE 2025

# CMD ["java" , ".jar" ,"app.jar"]

# FROM eclipse-temurin:17-jdk-alpine

# WORKDIR /app

# COPY target/ExpressCinema-0.0.1-SNAPSHOT.jar app.jar

# EXPOSE 2025

# CMD ["java", "-jar", "app.jar"]


FROM eclipse-temurin:17-jdk-alpine


ARG JAR_FILE=target/ExpressCinema-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]

