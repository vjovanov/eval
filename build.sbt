name := "Test-Project"

version := "1.0"

organization := "lamp.epfl.ch"

scalaVersion := "2.10.1-RC3"

resolvers += "junit interface repo" at "https://repository.jboss.org/nexus/content/repositories/scala-tools-releases"

libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.10.1-RC3"

libraryDependencies += "org.scala-lang" % "scala-compiler" % "2.10.1-RC3"

libraryDependencies +=  "junit" % "junit" % "4.10" % "test"

libraryDependencies += "com.novocode" % "junit-interface" % "0.10-M1" % "test"
