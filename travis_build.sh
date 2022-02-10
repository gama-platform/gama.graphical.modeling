#!/bin/bash 

cd idees.gama.parent &&
mvn clean install  -P p2Repo  --settings ../settings.xml &&
cd -
