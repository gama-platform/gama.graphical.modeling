#!/bin/sh

cd idees.gama.p2site &&
mvn clean install -P uploadRepo && 
cd -

