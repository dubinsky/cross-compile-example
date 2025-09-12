package example

import zio.test._

object ZIOTestTest extends ZIOSpecDefault {
  override def spec: Spec[TestEnvironment, Any] = suite("ZIOTestTest")(
    test("sq1") { assertTrue(SharedLibrary.instance.sq(1) == 1) },
    test("sq2") { assertTrue(SharedLibrary.instance.sq(2) == 4) },
    test("double") { assertTrue(SharedInMixedProjectRoot.double(3) == 6) },
    test("version specific") { assertTrue(
      SharedInMixedProjectRoot.versionSpecificProperty.endsWith(
        SharedInMixedProjectRoot.versionSpecificVersion
      )
    )}
  )
}
