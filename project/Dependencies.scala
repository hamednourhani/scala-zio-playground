import sbt._

object Dependencies {
  val scalaTestVersion  = "3.0.8"
  val scalaCheckVersion = "1.14.0"
  val zioVersion        = "1.0.0-RC12-1"
  val scalazVersion = "7.2.28"

  val scalatest  = "org.scalactic"  %% "scalactic"  % scalaTestVersion
  val scalactic  = "org.scalatest"  %% "scalatest"  % scalaTestVersion % Test
  val scalaCheck = "org.scalacheck" %% "scalacheck" % scalaCheckVersion % Test

  val zio       = "dev.zio" %% "zio"         % zioVersion
  val zioStream = "dev.zio" %% "zio-streams" % zioVersion
  val scalaz = "org.scalaz" %% "scalaz-core" % scalazVersion
}

