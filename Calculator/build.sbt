name := "Calculator"

version := "0.1"

scalaVersion := "2.13.5"

coverageEnabled := true

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.3" % Test,
  "org.mockito" %% "mockito-scala" % "1.5.12" % Test
)
