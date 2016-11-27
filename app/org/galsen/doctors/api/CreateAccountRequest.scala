package org.galsen.doctors.api

import play.api.libs.json.Json

case class CreateAccountRequest(email: String, password: String)

object CreateAccountRequest {

  implicit val format = Json.format[CreateAccountRequest]

}