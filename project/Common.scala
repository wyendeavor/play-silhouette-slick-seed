import sbt._
import Keys._

object Common {
  val settings: Seq[Setting[_]] = Seq(
    organization := "com.example",
    version := "3.0.2",
    scalaVersion := "2.11.7",
	scalacOptions ++= Seq(
	  "-deprecation", // Emit warning and location for usages of deprecated APIs.
	  "-feature", // Emit warning and location for usages of features that should be imported explicitly.
	  "-unchecked", // Enable additional warnings where generated code depends on assumptions.
	  "-Xfatal-warnings", // Fail the compilation if there are any warnings.
	  "-Xlint", // Enable recommended additional warnings.
	  "-Ywarn-adapted-args", // Warn if an argument list is modified to match the receiver.
	  "-Ywarn-dead-code", // Warn when dead code is identified.
	  "-Ywarn-inaccessible", // Warn about inaccessible types in method signatures.
	  "-Ywarn-nullary-override", // Warn when non-nullary overrides nullary, e.g. def foo() over def foo.
	  "-Ywarn-numeric-widen" // Warn when numerics are widened.
	)
  )

  //val fooDependency = "com.foo" %% "foo" % "2.4"
}

