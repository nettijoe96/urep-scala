// //https://github.com/playframework/play-scala-macwire-di-example/blob/2.7.x/app/GreetingApplicationLoader.scala

// import _root_.controllers.AssetsComponents
// import com.softwaremill.macwire._
// import play.api.ApplicationLoader.Context
// import play.api._
// import play.api.i18n._
// import play.api.mvc._
// import play.api.routing.Router

// /**
//  * Application loader that wires up the application dependencies using Macwire
//  */
// class MainApplicationLoader extends ApplicationLoader {
//   def load(context: Context): Application = new MainComponents(context).application
// }

// class MainComponents(context: Context) extends BuiltInComponentsFromContext(context)
//   with MainModule
//   with AssetsComponents
//   with I18nComponents 
//   with play.filters.HttpFiltersComponents {

//   // // set up logger
//   // LoggerConfigurator(context.environment.classLoader).foreach {
//   //   _.configure(context.environment, context.initialConfiguration, Map.empty)
//   // }

// //   lazy val router: Router = {
// //     // add the prefix string in local scope for the Routes constructor
// //     val prefix: String = "/"
// //     wire[Routes]
// //   }
// }