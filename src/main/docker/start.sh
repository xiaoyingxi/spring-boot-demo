#! /bin/bash

docker run -d -p 8080:8080 \
     --name demo-service \
     --log-driver=fluentd \
     --log-opt=fluentd-address=localhost:24224 \
     --log-opt=tag=yuuyoo.{{.Name}}.{{.ImageName}} \
     demo-service:latest