package example

import weaver.SimpleIOSuite

object WeaverScalaJSTest extends SimpleIOSuite {
  pureTest("sq"){ expect(SharedLibrary.instance.sq(1) == 1) }
}
