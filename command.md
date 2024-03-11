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
```







10101  ps -eo command,rss | grep quarkus 
10102  ps -eo command,rss 
10103  ps -eo 
10104  ps -edf
10105  ps -eo command,rss 
10106  ps -eo command,rss -h
10107  ps -eo command,rss --help 
10108  ps -h
10109  ps -eo command,rss | grep rental
10110  kill -9 31936
10111  ps -eo command,rss,pid | grep rental
10112  kill -9 25024
10113  quarkus dev
10114  quarkus --help 
10115  brew install podman
10116  quarkus extension list
10117  history 
10118  history | tail -n 40
10119  history | tail -n 100
