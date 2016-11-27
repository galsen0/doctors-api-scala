package org.galsen.doctors.controller

import com.google.inject.Inject
import com.stormpath.sdk.account.Account
import com.stormpath.sdk.client.Client
import org.galsen.doctors.api.{CreateAccountRequest, User}
import org.galsen.doctors.service.AuthenticatorService
import play.api.inject.ConfigurationProvider
import play.api.libs.json.{JsError, JsSuccess, Json}
import play.api.mvc.{Action, Controller}

import scala.concurrent.{ExecutionContext, Future}

class UserController @Inject()(
  val stormpathClient: Client,
  val config: ConfigurationProvider
)(implicit val ec: ExecutionContext) extends Controller with AuthenticatorService {

  def createAccount() = Action.async(parse.json) {
    implicit request =>
      request.body.validate[CreateAccountRequest] match {
        case JsSuccess(createAccountRequest, _) =>
          val account = stormpathClient.instantiate(classOf[Account])
            .setEmail(createAccountRequest.email)
            .setPassword(createAccountRequest.password)
          // TODO verify the email address
          application.createAccount(account)
          Future.successful(Ok(Json.toJson(User(account.getEmail))))
        case JsError(errors) => Future.successful(BadRequest)
      }
  }

}
