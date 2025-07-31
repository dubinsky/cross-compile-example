package example

import zio.test._

object ZIOTestScalaJSTest extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment, Any] = suite("ZIOTestTest")(
    test("sq1") { assertTrue(SharedLibrary.instance.sq(1) == 1) },
    test("sq2") { assertTrue(SharedLibrary.instance.sq(2) == 4) }
  )
}
