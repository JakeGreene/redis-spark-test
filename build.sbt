name := """redis-spark"""

assemblyJarName in assembly := "redis-spark.jar"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq( 
  "org.apache.spark" %% "spark-core" % "1.6.0" % "provided"
  ,"org.apache.spark" %% "spark-sql" % "1.6.0" % "provided"
  ,"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)

