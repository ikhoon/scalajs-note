package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport
import org.scalajs.jquery.jQuery

/**
  * Created by ikhoon on 29/11/2016.
  */
object TutorialApp extends JSApp {

  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
    appendParWithJQuery(document.body, "You clicked the button! with jquery")
  }


  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  def appendParWithJQuery(targetNode: dom.Node, text: String): Unit = {
    jQuery("body").append("<p>[message]</p>")
  }

  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
  }

  def main(): Unit = {
    jQuery(setupUI _)
  }
}


