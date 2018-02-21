FROM openjdk:9
ADD target/water-machine-0.0.1-SNAPSHOT.jar /app/
EXPOSE 8080

# WARNING! this line is here for backward compatiblity
#  Real command line now placed to openshift deployment config. See openshift/template.json
CMD ["/usr/bin/java", "-Xmx512m", "-Dlog.level=INFO", "-jar", "/app/water-machine-0.0.1-SNAPSHOT.jar"]