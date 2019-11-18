// @GENERATOR:play-routes-compiler
// @SOURCE:C:/web app/play-samples-play-java-starter-example/conf/routes
// @DATE:Mon Nov 18 22:41:34 IST 2019


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
