package example

import org.junit.Test
import org.junit.Assert.assertTrue

@Test final class JUnit4ScalaJSTest {
  @Test def output(): Unit = println(s"--- $getClass output")
  @Test def sq(): Unit = assertTrue(SharedLibrary.instance.sq(1) == 1)
}
