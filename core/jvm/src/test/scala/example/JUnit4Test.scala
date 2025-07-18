package example

import org.junit.Test
import org.junit.Assert.assertTrue

@Test final class JUnit4Test {
  @Test def sq1(): Unit = assertTrue(SharedLibrary.instance.sq(1) == 1)
  @Test def sq2(): Unit = assertTrue(SharedLibrary.instance.sq(2) == 4)
}
