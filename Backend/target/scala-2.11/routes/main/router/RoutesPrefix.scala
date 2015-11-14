
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Other/activator-1.3.6-minimal/socializer/conf/routes
// @DATE:Sat Nov 14 11:41:40 MSK 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
