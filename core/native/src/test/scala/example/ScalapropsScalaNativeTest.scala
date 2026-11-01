package example

import scalaprops._

object ScalapropsScalaNativeTest extends Scalaprops {
  property("revAndRevIsOriginal") = Property.forAll { (xs: List[Int]) => xs.reverse.reverse == xs }
  property("ignored") = Property.forAll { (xs: List[Int]) => xs.isEmpty }.ignore("ignore a test")
}
