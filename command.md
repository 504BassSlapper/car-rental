## Interesting commands 

``` bash
# init quarkus app
mvn io.quarkus.platform:quarkus-maven-plugin:3.8.2:create  -DprojectGroupId=org.acme  -DprojectArtifactId=getting-started -Dextensions='resteasy-reactive'
# start quarkus app in dev mode
mvn quarkus:dev
quarkus dev
# package app
mvn clean package
quarkus build
# run app
java -jar target/quarkus-app/quarkus-run.jar
# build nativ app mvn 
mvn package -Pnative
# build nativ using docker container 
quarkus build --native -Dquarkus.native.container-build=true
ps -eo command,rss | grep quarkus 
# list extension in app 
quarkus extension list
quarkus extension list --installable --category "messaging"
quarkus extension add quarkus-smallrye-reactive-messaging-kafka 
```


