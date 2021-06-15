# Graphly
A 2D graphical language project in cooperation with [Oskar Kocjan](https://github.com/OskarKocjan) and [Stanisław Światłoch](https://github.com/sswiatloch).

## Table of contents
* [Setup](#setup)
* [Example of usage](#example-of-usage)

## Setup

Run following commands
```
sudo ./installGraphly.sh path_to_main path_to_bashrc
source ~/.bashrc
```

`path_to_main` is path to a directory which contains main.py
`path_to_bashrc` is path to a .bashrc file (usually in /home/user directory)

## Example of usage
```
Graphly path_to_file
```
`path_to_file` is path to a Graphly script

Using `-e` option:
 ```
 Graphly path_to_file -e
 ```
 allows to see whole stacktrace in case of exception.
