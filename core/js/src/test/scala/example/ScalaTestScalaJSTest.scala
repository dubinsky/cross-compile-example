package example

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

final class ScalaTestScalaJSTest extends AnyFlatSpec with Matchers {
  "sq1" should "work" in { SharedLibrary.instance.sq(1) shouldBe 1 }
  "sq2" should "work" in { SharedLibrary.instance.sq(2) shouldBe 4 }
}
