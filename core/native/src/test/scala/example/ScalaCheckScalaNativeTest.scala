package example

import org.scalacheck.Prop.forAll
import org.scalacheck.Properties

final class ScalaCheckScalaNativeTest extends Properties("SharedLibrary") {
  property("sq") = forAll { (n: Int) => SharedLibrary.instance.sq(n) == n*n }
}
