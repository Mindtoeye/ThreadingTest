#!/bin/bash
clear

echo "Clean ..."
rm -rf ~/.m2/repository/knossys/
cp -v ../../../../chaperone/wildfly/target/knossys-1.0.0.jar ./lib/knossys/knossys/1.0.0

echo "Build ..."
mvn package

echo "Run ..."
java -cp "./target/KThreadingTestApp-jar-with-dependencies.jar:./lib/knossys-classes.jar" com.knossys.rnd.test.KThreadTestApp
