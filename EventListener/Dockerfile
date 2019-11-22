FROM openjdk:8
MAINTAINER SathishKumar Krishnan, sathish_krishnan@infosys.com
RUN mkdir -p /opt/eventservice
ADD target/eventListener.jar /opt/microservices/eventListener.jar
RUN chmod -R 777 /opt/eventservice
EXPOSE 7256
WORKDIR /opt/microservices
ENTRYPOINT ["java", "-Duser.timezone=Asia/Kolkata", "-jar", "/opt/microservices/eventListener.jar"] 