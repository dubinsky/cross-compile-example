package example

object Main:
  def main(args: Array[String]): Unit =
    println(s"Using JVM version ${System.getProperty("java.vm.version")}")
    SharedLibrary.instance.call("Scala on JVM", 1)
  

