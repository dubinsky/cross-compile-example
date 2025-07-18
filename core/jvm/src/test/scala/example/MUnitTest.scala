package example

final class MUnitTest extends munit.FunSuite {
  test("sq1") { assertEquals(SharedLibrary.instance.sq(1), 1) }
  test("sq2") { assertEquals(SharedLibrary.instance.sq(2), 4) }
}
