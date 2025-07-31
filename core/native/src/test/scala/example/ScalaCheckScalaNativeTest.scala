package example

import org.scalacheck.{Prop, Properties}

final class ScalaCheckScalaNativeTest extends Properties("SharedLibrary") {
  property("sq") = Prop.forAll { (n: Int) => SharedLibrary.instance.sq(n) == n*n }
}
