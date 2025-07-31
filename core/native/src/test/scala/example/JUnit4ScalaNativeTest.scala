package example

import org.junit.Test
import org.junit.Assert.assertTrue

@Test final class JUnit4ScalaNativeTest {
  @Test def output(): Unit = println(s"--- $getClass output")
  @Test def sq(): Unit = assertTrue(SharedLibrary.instance.sq(1) == 1)
  @Test def q3(): Unit = assertTrue(SharedJsNativeLibrary.instance.qube(2) == 8)
}
