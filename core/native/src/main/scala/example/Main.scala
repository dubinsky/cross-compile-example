package example

object Main {
  def main(args: Array[String]): Unit =
    println(s"Using Scala Native")
    SharedLibrary.instance.call("Scala Native", 3)
}
