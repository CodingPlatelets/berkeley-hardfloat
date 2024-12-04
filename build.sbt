organization := "edu.berkeley.cs"

version := "1.5.1-SNAPSHOT"

name := "hardfloat"

// build.sbt
scalaVersion := "2.13.12"
Compile / scalaSource := baseDirectory.value / "hardfloat/src/main/scala"
Test / scalaSource := baseDirectory.value / "hardfloat/tests/src"
Test / resourceDirectory := baseDirectory.value / "hardfloat/tests/resources"

val chiselVersion = "6.2.0"
addCompilerPlugin("org.chipsalliance" % "chisel-plugin" % chiselVersion cross CrossVersion.full)
libraryDependencies += "org.chipsalliance" %% "chisel" % chiselVersion
// libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.2.0" % "test")
libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
Test / testForkedParallel := true

publishMavenStyle := true
publishArtifact in Test := false
pomIncludeRepository := { x => false }
// Don't add 'scm' elements if we have a git.remoteRepo definition,
//  but since we don't (with the removal of ghpages), add them in below.
pomExtra := <url>http://chisel.eecs.berkeley.edu/</url>
  <licenses>
    <license>
      <name>BSD-style</name>
      <url>http://www.opensource.org/licenses/bsd-license.php</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/ucb-bar/berkeley-hardfloat.git</url>
    <connection>scm:git:github.com/ucb-bar/berkeley-hardfloat.git</connection>
  </scm>
  <developers>
    <developer>
      <id>jhauser-ucberkeley</id>
      <name>John Hauser</name>
    </developer>
    <developer>
      <id>aswaterman</id>
      <name>Andrew Waterman</name>
    </developer>
    <developer>
      <id>yunsup</id>
      <name>Yunsup Lee</name>
    </developer>
  </developers>

