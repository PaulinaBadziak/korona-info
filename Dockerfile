FROM tomcat:8.5-jre8-alpine

ENV CATALINA_HOME /usr/local/tomcat
ENV PATH $CATALINA_HOME/bin:$PATH

COPY ["target/korona-1.0-SNAPSHOT.war","/usr/local/tomcat/webapps/"]