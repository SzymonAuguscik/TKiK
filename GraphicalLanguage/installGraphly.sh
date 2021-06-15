#!/bin/bash

shopt -s expand_aliases

if [ $EUID -ne 0 ]; then
    echo "$0 is not running as root! Try using sudo"
    exit 2
fi

if [ $# -ne 2 ]
  then
    echo "Incorrect number of arguments! Expected 2, got $#"
    exit 1
fi

echo "alias Graphly='python3 $1/main.py'" >> $2/.bashrc