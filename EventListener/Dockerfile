FROM openjdk:8
MAINTAINER SathishKumar Krishnan, sathish_krishnan@infosys.com
RUN mkdir -p /opt/eventservice
ADD target/eventListener.jar /opt/eventservice/eventListener.jar
ADD keystore.p12 /opt/eventservice/keystore.p12
RUN chmod -R 777 /opt/eventservice
EXPOSE 7256
WORKDIR /opt/eventservice
ENTRYPOINT ["java", "-Duser.timezone=Asia/Kolkata", "-jar", "/opt/eventservice/eventListener.jar"] 