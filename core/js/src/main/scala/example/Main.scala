package example

object Main {
  def main(args: Array[String]): Unit =
    println(s"Using Scala.js version ${System.getProperty("java.vm.version")}")
    SharedLibrary.instance.call("Scala.js", 2)
}
