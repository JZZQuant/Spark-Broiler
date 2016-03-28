// If using CDH, also add Cloudera repo

name := "tutorials"
version := "1.0"
scalaVersion := "2.10.4"
resolvers += "Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/"
libraryDependencies ++= Seq("org.apache.spark" %% "spark-core" % "1.5.0-cdh5.6.0" %  "compile")
