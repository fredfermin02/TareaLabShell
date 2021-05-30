#!/bin/bash

NAME=${1?Error 100}

echo Hola, $NAME

if [ $? -eq 0 ]; then
  echo 0
fi 
