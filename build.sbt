name := "scalabazel"

version := "0.1"

scalaVersion := "2.11.8"

// mainClass in (Compile, run) := Some("com.urepscala.main.Main")
//mainClass in (Compile, run) := Some("test.Main")

libraryDependencies += ("org.scala-stm" %% "scala-stm" % "0.7")

libraryDependencies += ("com.googlecode.java-ipv6" % "java-ipv6" % "0.16")

libraryDependencies += ("com.softwaremill.macwire" %% "macros" % "2.3.0")

libraryDependencies += ("com.typesafe.play" %% "play-json" % "2.5.18")

libraryDependencies += ("org.reactivemongo" %% "play2-reactivemongo" % "0.12.4")


