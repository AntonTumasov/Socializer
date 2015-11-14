
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Other/activator-1.3.6-minimal/socializer/conf/routes
// @DATE:Sat Nov 14 11:41:40 MSK 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_2: controllers.Application,
  // @LINE:9
  Authentication_0: controllers.Authentication,
  // @LINE:10
  Registration_3: controllers.Registration,
  // @LINE:14
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_2: controllers.Application,
    // @LINE:9
    Authentication_0: controllers.Authentication,
    // @LINE:10
    Registration_3: controllers.Registration,
    // @LINE:14
    Assets_1: controllers.Assets
  ) = this(errorHandler, Application_2, Authentication_0, Registration_3, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_2, Authentication_0, Registration_3, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Application.register()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """main""", """controllers.Application.main()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """auth""", """controllers.Authentication.auth()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """join""", """controllers.Registration.join()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.Authentication.logout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_2.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_Application_register1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Application_register1_invoker = createInvoker(
    Application_2.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "register",
      Nil,
      "GET",
      """""",
      this.prefix + """register"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_Application_main2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("main")))
  )
  private[this] lazy val controllers_Application_main2_invoker = createInvoker(
    Application_2.main(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "main",
      Nil,
      "GET",
      """""",
      this.prefix + """main"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Authentication_auth3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("auth")))
  )
  private[this] lazy val controllers_Authentication_auth3_invoker = createInvoker(
    Authentication_0.auth(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "auth",
      Nil,
      "POST",
      """""",
      this.prefix + """auth"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Registration_join4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("join")))
  )
  private[this] lazy val controllers_Registration_join4_invoker = createInvoker(
    Registration_3.join(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Registration",
      "join",
      Nil,
      "POST",
      """""",
      this.prefix + """join"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Authentication_logout5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_Authentication_logout5_invoker = createInvoker(
    Authentication_0.logout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Authentication",
      "logout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Assets_versioned6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned6_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_2.index())
      }
  
    // @LINE:7
    case controllers_Application_register1_route(params) =>
      call { 
        controllers_Application_register1_invoker.call(Application_2.register())
      }
  
    // @LINE:8
    case controllers_Application_main2_route(params) =>
      call { 
        controllers_Application_main2_invoker.call(Application_2.main())
      }
  
    // @LINE:9
    case controllers_Authentication_auth3_route(params) =>
      call { 
        controllers_Authentication_auth3_invoker.call(Authentication_0.auth())
      }
  
    // @LINE:10
    case controllers_Registration_join4_route(params) =>
      call { 
        controllers_Registration_join4_invoker.call(Registration_3.join())
      }
  
    // @LINE:11
    case controllers_Authentication_logout5_route(params) =>
      call { 
        controllers_Authentication_logout5_invoker.call(Authentication_0.logout())
      }
  
    // @LINE:14
    case controllers_Assets_versioned6_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned6_invoker.call(Assets_1.versioned(path, file))
      }
  }
}