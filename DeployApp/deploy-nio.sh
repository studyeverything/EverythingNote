#!/bin/bash

pkill -f 'java -jar ../nioserver/NioServer-0.0.1-SNAPSHOT-jar-with-dependencies.jar'
pkill -f 'java -jar ../customernioserver/nioserver.customer-0.0.1-SNAPSHOT-jar-with-dependencies.jar'

nohup java -jar ../nioserver/NioServer-0.0.1-SNAPSHOT-jar-with-dependencies.jar &
nohup java -jar ../customernioserver/nioserver.customer-0.0.1-SNAPSHOT-jar-with-dependencies.jar &

ps aux | grep java
