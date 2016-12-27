package org.galsen.doctors.controllers

import play.api.mvc.{Action, Controller}

class HomeController extends Controller {

  def hello() = Action(Ok("Hello world"))

}
