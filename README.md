# Graphly
A 2D graphical language project in cooperation with [Oskar Kocjan](https://github.com/OskarKocjan) and [Stanisław Światłoch](https://github.com/sswiatloch).

## Table of contents
* [Setup](#setup)
* [Example of usage](#example-of-usage)
* [Details](#details)

## Setup

Run following commands
```
sudo ./installGraphly.sh path_to_main path_to_bashrc
source ~/.bashrc
```

`path_to_main` is path to a directory which contains main.py and `path_to_bashrc` is path to a directory which contains .bashrc file (usually in /home/user or ~)

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
 
 ## Details
For more information see "Dokumentacja_języka_Graphly.pdf"
