name := "learning-spark-mini-example"

version := "0.0.1"

scalaVersion := "2.10.6"

// additional libraries
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2" % "provided"
)
