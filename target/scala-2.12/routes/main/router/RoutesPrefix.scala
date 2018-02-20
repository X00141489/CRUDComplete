
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/crudauthentication/conf/routes
// @DATE:Tue Feb 20 19:56:31 GMT 2018


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
