#!/bin/bash

# kill rest api background process
pkill -f 'java -jar ../qrpay_uplus/qrpay_uplus-0.0.2-SNAPSHOT.jar'
pkill -f 'java -jar ../Demo-0.0.1-SNAPSHOT.jar'

# start background process
nohup java -jar ../qrpay_uplus/qrpay_uplus-0.0.2-SNAPSHOT.jar &
nohup java -jar ../Demo-0.0.1-SNAPSHOT.jar &

ps aux | grep java
