# Pattern Matching in Scala : Exercices

A set of exercises to practice on Pattern Matching in Scala.
Each exercise is an object with method(s) to implement, with explanations as a comment.
Corresponding unit tests allow you to validate your implementations.

A 'solution' branch provides solution implementations for all exercises.

## Prerequisites

I recommend to open the project using IntelliJ IDEA Community Edition https://www.jetbrains.com/idea/download/.
Install the Scala plugin for Intellij in Preferences > Plugins > Browse Repositories.

## Run the tests

The source code with methods to implement will be in each exercise package :
```src/main/scala/exercice_x```
The corresponding tests are in :
```src/test/scala/exercice_x```
The tests can be run by right-clicking on the test class `...Spec`, and select `Run '...Spec''`

Bear in mind that in Scala, your code must compile first before you can run the tests, you will need to fix compilation errors first.
The placeholder `???` in the source classes allows to havec unimplemented blocks that still compile.

Alternatively, the tests can be run with sbt command-line :
```
sbt
> testOnly exercice_0.*
```
(Install Scala with SBT http://www.scala-sbt.org/download.html)