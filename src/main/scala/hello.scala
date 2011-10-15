import unfiltered.request._
import unfiltered.response._
import unfiltered.netty._

object Hello extends cycle.Plan with cycle.ThreadPool with ServerErrorResponse {
  def intent = {
    case Path(Seg("hello" :: Nil)) => ResponseString("Hello from Unfiltered!")
  }
}

object Main extends App {
  unfiltered.netty.Http(8080).plan(Hello).run()
}

