package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document

/**
  * Created by ikhoon on 29/11/2016.
  */
object TutorialApp extends JSApp {

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  def main(): Unit = {
    appendPar(document.body, "Hello world")
  }
}


