FROM openjdk:8-jre-alpine
COPY ./target/product-0.0.1-SNAPSHOT.jar /usr/src/myboiler/
WORKDIR /usr/src/myboiler
EXPOSE 8080
CMD ["java", "-jar", "product-0.0.1-SNAPSHOT.jar"]
