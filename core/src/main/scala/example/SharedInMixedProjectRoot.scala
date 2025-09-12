package example

import scala.io.Source

object SharedInMixedProjectRoot {
  def versionSpecificVersion: String = ScalaVersionSpecific.version
  def versionSpecificProperty: String = Source.fromResource("ScalaVersionSpecific.properties").getLines().next()

  def double(x: Int): Int = x + x
}
