package example

final class MUnitScalaNativeTest extends munit.FunSuite {
  test("output") {println(s"--- $getClass output")}
  test("sq1") { assertEquals(SharedLibrary.instance.sq(1), 1) }
  test("sq2") { assertEquals(SharedLibrary.instance.sq(2), 4) }
}
