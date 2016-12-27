name := "doctors-api-scala"
organization := "org.galsen.doctors"

version := "1.0"
scalaVersion := "2.11.8"
sbtVersion := "0.13.11"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

val macwireVersion = "2.2.5"
val playSlickVersion = "2.0.0"
val silhouetteVersion = "4.0.0"

libraryDependencies ++= Seq(
  "com.softwaremill.macwire" %% "macros" % macwireVersion % "provided",
  "com.softwaremill.macwire" %% "util" % macwireVersion,
  "com.softwaremill.macwire" %% "proxy" % macwireVersion,
  "com.typesafe.play" %% "play-slick" % playSlickVersion,
  "com.typesafe.play" %% "play-slick-evolutions" % playSlickVersion,
  "com.mohiva" %% "play-silhouette" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-password-bcrypt" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-crypto-jca" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-persistence" % silhouetteVersion,
  "com.mohiva" %% "play-silhouette-testkit" % silhouetteVersion % Test
)
