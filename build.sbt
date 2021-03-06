enablePlugins(JavaAppPackaging)

name := "log-all"

scalaSource in Compile := baseDirectory.value / "app"

resourceDirectory in Compile := baseDirectory.value / "app"

scalaVersion := "2.13.1"

libraryDependencies := Seq(
  "com.typesafe.play" %% "play-akka-http-server" % "2.8.1",
  "org.slf4j" % "slf4j-simple" % "1.7.21",
)

Global / cancelable := false
