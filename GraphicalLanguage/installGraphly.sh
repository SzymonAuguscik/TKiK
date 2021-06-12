#!/bin/bash

if [ $EUID -ne 0 ]; then
    echo "$0 is not running as root! Try using sudo"
    exit 2
fi

if [ $# -eq 0 ]
  then
    echo "No arguments supplied!"
    exit 1
fi

echo "alias Graphly='python3 $1/main.py'" >> ~/.bashrc