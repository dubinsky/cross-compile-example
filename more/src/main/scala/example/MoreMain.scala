package example

object MoreMain {
  def main(args: Array[String]): Unit = {
    println("calling Main from MoreMain")
    Main.main(args)
  }
}
