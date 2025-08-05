//package example
//
//import scalaprops._
//
//object ScalapropsScalaNativeTest extends Scalaprops {
//  val revAndRevIsOriginal = Property.forAll { (xs: List[Int]) => xs.reverse.reverse == xs }
//  val revIsOriginal = Property.forAll { (xs: List[Int]) => xs.reverse == xs }
//  val empty = Property.forAll { (xs: List[Int]) => xs.isEmpty }.ignore("ignore a test")
//}
