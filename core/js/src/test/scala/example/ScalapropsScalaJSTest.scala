//package example
//
//import scalaprops._
//
//object ScalapropsScalaJSTest extends Scalaprops {
//  val revAndRevIsOriginal = Property.forAll { (xs: List[Int]) => xs.reverse.reverse == xs }
//  val revIsOriginal = Property.forAll { (xs: List[Int]) => xs.reverse == xs }
//  val ignored = Property.forAll { (xs: List[Int]) => xs.isEmpty }.ignore("ignore a test")
//}
