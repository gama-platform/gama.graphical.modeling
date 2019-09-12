#!/bin/bash
cd idees.gama.p2site && 
mvn -U clean install -P p2Repo --settings ../settings.xml && 
cd -