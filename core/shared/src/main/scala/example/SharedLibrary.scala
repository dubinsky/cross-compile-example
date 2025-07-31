package example

class SharedLibrary {
  def call(from: String, number: Int): Unit =
    println(s"SharedLibrary called from $from; square of $number is ${sq(number)}.")

  def sq(x: Int): Int = x * x
}

object SharedLibrary {
  def instance: SharedLibrary = new SharedLibrary
}
 