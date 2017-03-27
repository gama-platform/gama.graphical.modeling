#!/bin/bash
cd idees.gama.p2site &&
mvn clean install -P p2Repo --settings ../settings.xml && 
cd -