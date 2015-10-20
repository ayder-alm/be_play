name := "betest"

version := "1.0"

lazy val `betest` = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(jdbc, javaWs, filters, javaJpa,
  "org.mindrot" % "jbcrypt" % "0.3m",
  "joda-time" % "joda-time" % "2.3",
  "commons-io" % "commons-io" % "2.3",
  "org.joda" % "joda-convert" % "1.6")

libraryDependencies ++= Seq("org.webjars" %% "webjars-play" % "2.3.0-2",
  "com.typesafe.play" %% "play-slick" % "0.9.0-M1",
  "org.avaje.ebeanorm" % "avaje-ebeanorm" % "4.6.2",
  "com.typesafe.play" %% "play-mailer" % "2.4.0")

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  