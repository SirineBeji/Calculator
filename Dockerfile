FROM maven

WORKDIR /app

ADD .

RUN mvn clean package

