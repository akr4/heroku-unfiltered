import unfiltered.request._
import unfiltered.response._
import unfiltered.netty._
import util.Properties

object Hello extends cycle.Plan with cycle.ThreadPool with ServerErrorResponse {
  def intent = {
    case Path(Seg("hello" :: Nil)) => ResponseString("Hello from Unfiltered!")
  }
}

object Main extends App {
  val port = Properties.envOrElse("PORT", "8080").toInt
  unfiltered.netty.Http(port).plan(Hello).run()
}

