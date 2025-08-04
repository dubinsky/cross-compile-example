package example

import weaver.SimpleIOSuite

object WeaverTest extends SimpleIOSuite {
  pureTest("sq"){ expect(SharedLibrary.instance.sq(1) == 1) }
}
