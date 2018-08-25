FROM maven

WORKDIR /app

ADD . /app

RUN mvn clean package

