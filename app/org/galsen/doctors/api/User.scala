package org.galsen.doctors.api

import play.api.libs.json.Json

case class User(email: String)

object User {

  implicit val format = Json.format[User]

}
