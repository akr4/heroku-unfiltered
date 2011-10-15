import com.typesafe.startscript.StartScriptPlugin

seq(StartScriptPlugin.startScriptForClassesSettings: _*)

organization := "net.physalis"

name := "hello"

version := "0.1"

scalaVersion := "2.9.1"

libraryDependencies ++= Seq(
  "org.scala-tools.time" %% "time" % "0.5",
  "postgresql" % "postgresql" % "9.0-801.jdbc4" withSources(),
  "net.sf.ehcache" % "ehcache" % "1.5.0" withSources(),
  "ch.qos.logback" % "logback-classic" % "0.9.25" withSources(),
  "org.codehaus.groovy" % "groovy" % "1.8.0" withSources(),
  "org.slf4j" % "jcl-over-slf4j" % "1.6.2" withSources(),
  "org.clapper" %% "grizzled-slf4j" % "0.6.6",
  "net.databinder" %% "unfiltered-filter" % "0.5.0",
  "net.databinder" %% "unfiltered-netty" % "0.5.0",
  "net.databinder" %% "unfiltered-netty-server" % "0.5.0",
  "net.databinder" %% "unfiltered-scalate" % "0.5.0",
  "net.databinder" %% "unfiltered-json" % "0.5.0"
)

