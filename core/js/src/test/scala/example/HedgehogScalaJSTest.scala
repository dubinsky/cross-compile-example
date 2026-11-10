package example

import hedgehog.*
import hedgehog.runner.*

object HedgehogScalaJSTest extends Properties {
  def tests: List[Test] =
    List(
      property("sq", sq)
    )

  def sq: Property = for {
    n <- Gen.int(Range.linear(0, 1000)).forAll
  } yield SharedLibrary.instance.sq(n) ==== n*n
}
