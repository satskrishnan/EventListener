#!/bin/bash
nohup java -jar -Dspring.profiles.active=prod ../target/eventListener.jar > /home/sathish/eventLog/log.txt 2>&1 &
echo $! > /home/sathish/eventLog/pid.file