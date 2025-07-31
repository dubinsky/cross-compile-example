package example

object Main {
  def main(args: Array[String]): Unit =
    println(s"Using Scala Native")
    SharedJsNativeLibrary.instance.call("Scala Native", 3)
}
