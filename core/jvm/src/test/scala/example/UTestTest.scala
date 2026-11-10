package example

import utest.*

object UTestTest extends TestSuite {
  val tests: Tests = Tests {
    test("sq") { assert(SharedLibrary.instance.sq(1) == 1) }
  }
}
