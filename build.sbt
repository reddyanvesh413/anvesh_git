resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

name := """act-services-digital-store"""

version := "1.0"

packageName in Universal := "act-services-digital-store"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.1"
scalacOptions += "-feature"

libraryDependencies ++= Seq(
  cacheApi,
  caffeine,
  ws,
  guice,
  "org.reactivemongo" %% "play2-reactivemongo" % "0.18.7-play27",
  "org.reactivemongo" %% "reactivemongo-play-json" % "0.18.7-play27",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.10.1",
  "com.rabbitmq" % "amqp-client" % "4.1.1",
  "com.amazonaws" % "aws-java-sdk-core" % "1.11.712",
  "org.apache.commons" % "commons-lang3" % "3.9",
  "ai.x" %% "play-json-extensions" % "0.42.0",
  "org.mockito" % "mockito-core" % "3.2.4" % Test,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test,
  "com.typesafe.akka" %% "akka-testkit" % "2.6.1" % Test,
)
val akkaVersion = "2.6.1"
dependencyOverrides ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "com.typesafe.akka" %% "akka-protobuf" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion
)


