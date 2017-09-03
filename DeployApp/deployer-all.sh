#!/bin/bash

pkill -f 'java -jar'
nohup java -jar ../nioserver/NioServer-0.0.1-SNAPSHOT-jar-with-dependencies.jar &
nohup java -jar ../customernioserver/nioserver.customer-0.0.1-SNAPSHOT-jar-with-dependencies.jar &
nohup java -jar ../qrpay_uplus/qrpay_uplus-0.0.2-SNAPSHOT.jar &
nohup java -jar ../Demo-0.0.1-SNAPSHOT.jar &

ps aux | grep java

