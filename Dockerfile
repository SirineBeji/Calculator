FROM maven

WORKDIR /app

ADD . /app

RUN mvn clean package

CMD ["java", "-classpath", "target/Calculator-0.0.2-SNAPSHOT.jar", "Calcuator.Calcuator.App"]
