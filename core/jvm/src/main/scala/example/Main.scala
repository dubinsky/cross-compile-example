package example

object Main {
  def main(args: Array[String]): Unit =
    println(s"Using JVM version ${System.getProperty("java.vm.version")}")
    SharedLibrary.instance.call("Scala on JVM", 1)

    println(s"Using Scala-version-specific code    : '${SharedInMixedProjectRoot.versionSpecificVersion}'.")
    println(s"Using Scala-version-specific resource: '${SharedInMixedProjectRoot.versionSpecificProperty}'.")
}
