#!/bin/bash
export DISPLAY=:0 
export CLASSPATH="$CLASSPATH:./bin:./lib/javax.json-1.0.4.jar:./lib/py4j0.10.4.jar:./lib/lwjgl/*:./lib/natives/linux/*:./AIs/*"
java Main --limithp 400 400 --py4j --grey-bg --inverted-player 1
