#!/bin/bash

username=$(whoami)
#echo $username;
if [ "$username" != "root" ]
    then echo "Please login as root and continue"
fi
cp ./springserver.service /etc/systemd/system
mkdir /opt/springserver
cp ./startup.sh /opt/springserver
systemctl start springserver
