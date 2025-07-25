package example

import org.specs2._
import org.specs2.execute.Result

final class Specs2Test extends Specification {
  def is = s2"""

  This is a specification to check the SharedLibrary

  The SharedLibrary should
    output test output ${output()}
    square numbers properly $sq
  """

  def output(): Unit = println(s"--- $getClass output")
  def sq: Result = SharedLibrary.instance.sq(1) must beEqualTo(1)
}
