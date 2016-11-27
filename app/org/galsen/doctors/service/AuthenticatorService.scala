package org.galsen.doctors.service

import com.stormpath.sdk.application.Applications
import com.stormpath.sdk.client.Client
import play.api.inject.ConfigurationProvider

import scala.concurrent.ExecutionContext

trait AuthenticatorService {

  val stormpathClient: Client
  val config: ConfigurationProvider
  implicit val ec: ExecutionContext

  val application = stormpathClient.getApplications(
    Applications.where(Applications.name().eqIgnoreCase(config.get.getString("stormpath.application.name").get)))
    .single()

}
