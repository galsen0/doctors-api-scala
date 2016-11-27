name := "doctors-api-scala"

version := "1.0"
scalaVersion := "2.11.8"
sbtVersion := "0.13.11"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies ++= Seq(
  "com.stormpath.sdk" % "stormpath-sdk-api" % "1.2.0",
  "com.stormpath.sdk" % "stormpath-sdk-httpclient" % "1.2.0"
)