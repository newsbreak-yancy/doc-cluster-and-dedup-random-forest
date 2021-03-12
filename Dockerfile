FROM docker.particlenews.com:5000/ubuntu/java8:vimcron

RUN  apt update \
  && apt install -y wget \
  && rm -rf /var/lib/apt/lists/*

RUN groupadd -g 1001 services
RUN useradd  -g 1001 -u 1001 -m services

COPY target/RandomForest-0.0.1.jar /home/services/bin/
COPY src/main/resources/logback-spring.xml /home/services/bin/

RUN chown -R services:services /home/services

USER services
WORKDIR /home/services/bin
