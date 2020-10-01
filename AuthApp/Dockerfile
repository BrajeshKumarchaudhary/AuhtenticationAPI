FROM ubuntu:18.04
RUN apt-get update
RUN apt-get install openjdk-8-jdk -y
MAINTAINER BRAJESH KUMAR(bk04031997@gmail.com)
RUN mkdir /opt/tomcat/
RUN curl -O https://downloads.apache.org/tomcat/tomcat-8/v8.5.58/bin/apache-tomcat-8.5.58.tar.gz
RUN tar xvfz apache*.tar.gz
RUN mv apache-tomcat-8.5.58/* /opt/tomcat/
WORKDIR /opt/tomcat/webapps
COPY SportsLottery.war  /opt/tomcat/webapps
CMD ["/opt/tomcat/bin/catalina.sh", "start"]

