package net.physalis.herokuunfiltered

import unfiltered.request._
import unfiltered.response._
import unfiltered.netty._
import util.Properties
import grizzled.slf4j.Logging

object Hello extends cycle.Plan with cycle.ThreadPool with ServerErrorResponse with Logging {
  def intent = {
    case Path(Seg("hello" :: Nil)) & Params(params) => {
      debug(params)
      ResponseString("Hello %s".format(params("name").headOption.getOrElse("Unfiltered")))
    }
    case Path(_) => ResponseString("Hello from Unfiltered!")
  }
}

object Main extends App with Logging {
  val port = Properties.envOrElse("PORT", "8080").toInt
  info("started on port:%d".format(port))
  unfiltered.netty.Http(port).plan(Hello).run()
}

