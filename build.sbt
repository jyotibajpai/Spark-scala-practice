name := "Spark-HandsOn"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.1.1"

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "2.1.1"

libraryDependencies += "com.fasterxml.jackson.core" % "jackson-databind" % "2.4.4"

libraryDependencies += "com.google.code.gson" % "gson" % "2.3.1"


resolvers += "Akka Repository" at "http://repo.akka.io/releases/"
