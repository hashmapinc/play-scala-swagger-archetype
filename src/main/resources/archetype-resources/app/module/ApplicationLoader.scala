package module

import com.typesafe.config.ConfigFactory
import play.api.ApplicationLoader.Context
import play.api.Configuration
import play.api.inject.guice.{GuiceApplicationBuilder, GuiceApplicationLoader}

class ApplicationLoader extends GuiceApplicationLoader{

  override def builder(context: Context): GuiceApplicationBuilder = {
    val mode = sys.env.getOrElse("ENV", "APPLICATION")
    val envConfig = Configuration(ConfigFactory.load(s"${mode.toLowerCase}.conf"))
    initialBuilder
      .in(context.environment)
      .loadConfig(context.initialConfiguration ++ envConfig)
      .overrides(overrides(context): _*)
  }
}
