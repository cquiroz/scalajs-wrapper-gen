package com.olvind

import ammonite.ops._
import com.olvind.requiresjs._

class JsParserTest extends org.scalatest.FunSuite
                           with org.scalatest.Matchers {

  private val mui15 = cwd / "src" / "test" / "resources" / "mui15" / "comps"
  private val semanticui = cwd / "src" / "test" / "resources" / "semanticui"

  /*test("Divider.propTypes = propTypes;") {
    println(mui15)
    val result = Require(mui15 / "Divider.js")
    println(result)
  }*/

  test("Divider.propTypes = propTypes;") {
    val result = Require(semanticui / "input.js")
    println(result)
  }

//  test("Drawer.propTypes = {...}") {
//    val result: Required = Require(mui15 / "Drawer.js")
//    println(result)
//  }
}
