package example

import org.scalacheck.{Prop, Properties}

final class ScalaCheckScalaNativeTest extends Properties("SharedLibrary") {
  property("output") = Prop { println(s"--- $getClass output"); true }
  property("sq") = Prop.forAll { (n: Int) => SharedLibrary.instance.sq(n) == n*n }
}
