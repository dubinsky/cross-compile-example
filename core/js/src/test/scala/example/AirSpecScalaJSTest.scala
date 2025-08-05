package example

import wvlet.airspec._

object AirSpecScalaJSTest extends AirSpec {
  test("square of 2 should be 4") { SharedLibrary.instance.sq(2) shouldBe 4 }
}
