
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /* hello Template File */
  def apply/*2.2*/(name:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""
"""),format.raw/*4.1*/("""<html>
<head>
<title>welcome</title>
</head>

<body>
<p>welcome """),_display_(/*10.13*/name),format.raw/*10.17*/(""" """),format.raw/*10.18*/("""</p>
</body>
</html>
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-11-18T02:40:01.837
                  SOURCE: C:/web app/play-samples-play-java-starter-example/app/views/hello.scala.html
                  HASH: cdea2fa2c3e384c93197b7026600d5ec104271e8
                  MATRIX: 969->27|1076->41|1103->42|1195->107|1220->111|1249->112
                  LINES: 28->2|33->3|34->4|40->10|40->10|40->10
                  -- GENERATED --
              */
          