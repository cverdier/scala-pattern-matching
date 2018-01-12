package exercice_1

object FizzBuzz extends App {

  /** The FizzBuzz problem.
    * For a given natural number greater than zero return :
    *  - “fizz” if the number is dividable by 3
    *  - “buzz” if the number is dividable by 5
    *  - “fizzbuzz” if the number is dividable by 3 and by 5
    *  - the same number (as String) if no other requirement is fulfilled
    */
  def getResult(number: Int): String = {
    (number % 3, number % 5) match {
      case (0, 0) => "fizzbuzz"
      case (0, _) => "fizz"
      case (_, 0) => "buzz"
      case (_, _) => number.toString
    }
  }

  private val sample = List(1, 3, 4, 6, 15, 10, 2, 15, 22, 30, 25, 17)

  sample.foreach { number =>
    val result = getResult(number)
    println(s"$number: $result")
  }
}
