package example

import utest._

object UTestScalaJSTest extends TestSuite {
  val tests: Tests = Tests {
    test("output") { println(s"--- $getClass output") }
    test("sq") { assert(SharedLibrary.instance.sq(1) == 1) }
  }
}
