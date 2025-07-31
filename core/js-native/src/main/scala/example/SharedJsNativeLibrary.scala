package example

class SharedJsNativeLibrary {
  def call(from: String, number: Int): Unit =
    println(s"SharedJsNativeLibrary called from $from; square of $number is ${qube(number)}.")

  def qube(x: Int): Int = x * x * x
}

object SharedJsNativeLibrary {
  def instance: SharedJsNativeLibrary = new SharedJsNativeLibrary
}
 