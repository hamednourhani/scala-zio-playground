import Dependencies._

lazy val scala212               = "2.12.8"
lazy val scala213               = "2.13.0"
lazy val supportedScalaVersions = List(scala212, scala213)

ThisBuild / scalaVersion     := scala212
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "ir.h4n"
ThisBuild / organizationName := "h4n"

lazy val root = (project in file("."))
  .settings(
    name               := "scala-zio-playground",
    crossScalaVersions := supportedScalaVersions,
    publish / skip     := true,
    libraryDependencies ++= Seq(
      zio,
      scalaz,
      scalatest % Test
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
