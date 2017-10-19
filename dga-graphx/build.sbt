name := "dga-graphx"

version := "0.1"

scalaVersion := "2.11.8"

val sparkVersion = "2.2.0"

libraryDependencies += "org.apache.spark" % "spark-graphx_2.11" % sparkVersion % "provided"
libraryDependencies += "com.github.scopt" % "scopt_2.11" % "3.7.0"
