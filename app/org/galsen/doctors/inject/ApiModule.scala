package org.galsen.doctors.inject

import com.google.inject.{AbstractModule, Provides, Singleton}
import com.stormpath.sdk.api.ApiKeys
import com.stormpath.sdk.client.{Client, Clients}
import play.api.inject.ConfigurationProvider

class ApiModule extends AbstractModule {

  override def configure(): Unit = ()

  @Provides
  @Singleton
  def provideStormpathClient(config: ConfigurationProvider): Client = Clients.builder().setApiKey(
    ApiKeys.builder().setId("58YWRQEHFJMYOG1BNRATB8IZI").setSecret("5/V8PAJFs2X8YU6VrAvZ/C4BgDhoH3Nr2EJvezmij/A").build()
  ).build()

}
