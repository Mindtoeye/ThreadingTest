#!/bin/bash
clear
mvn package
java -cp "./target/KThreadingTestApp-jar-with-dependencies.jar:./lib/knossys-classes.jar" com.knossys.rnd.test.KThreadTestApp
