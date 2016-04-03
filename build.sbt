name := "scala-log"

scalaVersion := "2.10.5"

scalacOptions in ThisBuild ++= Seq(
    "-deprecation",
    "-feature",
    "-language:postfixOps",
    "-unchecked"
)

resolvers ++= Seq(
    "java.net repo" at "http://download.java.net/maven/2/",
    "sbt-plugin-releases" at "http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"
)

libraryDependencies += "org.slf4j" % "slf4j-api" % "1.7.12"
