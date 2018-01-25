package scalaui

import scala.scalanative.native.{Zone, toCString, fromCString}
import ui._

class Group(t: String, content: Component, margin: Int = 0) extends Component {
  private[scalaui] override def build(): Unit = Zone { implicit z =>
    control = uiNewGroup(toCString(t))
    content.build()
    uiGroupSetChild(control, content.control)
    uiGroupSetMargined(control, margin)
  }

  def title_=(title: String): Unit = Zone { implicit z =>
    uiGroupSetTitle(control, toCString(title))
  }

  def title: String = fromCString(uiGroupTitle(control))
}
