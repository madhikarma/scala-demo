## Description

Demo repo for learning Scala for Backend development

## Environment

- macOS (Sequoia v15.5)
- Java (JDK 24) (download DMD from (https://www.oracle.com/java/technologies/downloads/#jdk24-mac or brew)

## Installation

### Install Scala
    brew install coursier && coursier setup

### Install SBT
    brew install sbt

## Usage

## Command line apps

### 1. Hello World
    scala run helloworld.scala

### 2. Counter

    scala run counter.scala

or (without warnings)

    scala -J--add-opens=java.base/sun.misc=ALL-UNNAMED run counter.scala

### 3. SBT apps
    
    sbt
    compile
    run
