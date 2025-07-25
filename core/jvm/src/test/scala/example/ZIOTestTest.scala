package example

import zio.test._

object ZIOTestTest extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment, Any] = suite("ZIOTestTest")(
    test("output") { println(s"--- $getClass output"); assertTrue(true) },
    test("sq1") { assertTrue(SharedLibrary.instance.sq(1) == 1) },
    test("sq2") { assertTrue(SharedLibrary.instance.sq(2) == 4) }
  )
}
