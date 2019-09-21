package ir.h4n.zio
import java.io.IOException

import zio.App
import zio.ZIO

object HelloRunner extends App {
  override def run(
      args: List[String]
  ): ZIO[HelloRunner.Environment, Nothing, Int] = greeting.fold(_ => 1, _ => 0)

  import zio.console._

  def greeting: ZIO[Console, IOException, Unit] =
    for {
      _    <- putStrLn("what is your name?")
      name <- getStrLn
      _    <- putStrLn(s"hello $name")
    } yield ()
}
