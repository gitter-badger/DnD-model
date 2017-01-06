name := "DnD-model"

version := "1.0"

scalaVersion := "2.12.1"

scalacOptions ++= Seq("-feature")

//libraryDependencies += "org.squeryl" %% "squeryl" % "0.9.7"

libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"

libraryDependencies += "org.apache.logging.log4j" % "log4j-core" % "2.7"

libraryDependencies += "org.apache.logging.log4j" % "log4j-api" % "2.7"

libraryDependencies += "org.apache.logging.log4j" % "log4j-slf4j-impl" % "2.7"

//libraryDependencies += "com.h2database" % "h2" % "1.4.193" % "test"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

