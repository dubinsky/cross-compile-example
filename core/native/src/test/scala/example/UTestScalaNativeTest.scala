package example

import utest._

object UTestScalaNativeTest extends TestSuite {
  val tests: Tests = Tests {
    test("sq") { assert(SharedLibrary.instance.sq(1) == 1) }
  }
}
