package example

import org.junit.Test
import org.junit.Assert.assertTrue

@Test final class JUnit4Test:
  @Test def test(): Unit = assertTrue(SharedLibrary.instance.sq(1) == 1)
