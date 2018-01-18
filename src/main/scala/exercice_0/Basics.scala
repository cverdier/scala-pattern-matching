package exercice_0

object Basics {

  val knownCities: List[String] = List("Paris", "Tokyo", "Munich", "Montcuq")

  /** Use constant patterns
    * Match exactly city names in 'knownCities', and return their population according to Wikipedia
    * */
  def getCityPopulation(name: String): Int = {
    name match {
      case "Paris" => 2206488
      case "Tokyo" => 13622267
      case "Munich" => 1548319
      case "Montcuq" => 1241
    }
  }


  /** Use typed patterns
    * Match elements by their type and return the type translated in French.
    * The expected types are "Entier", "Chaîne", "Booléen" and "Flotant"
    * Return an empty string "" for unsupported types
    * */
  def getTypeInFrench(value: Any): String = {
    value match {
      case _: Int => "Entier"
      case _: String => "Chaîne"
      case _: Boolean => "Booléen"
      case _: Float => "Flotant"
    }
  }


  /** Use guards
    * If number is one of the first 5 prime numbers (0 and 1 are not prime numbers), return "prime"
    * If it is 0, return "zero"
    * Else, if it is greater or equal than 10, return "large"
    * Else, (if it is less than 10) return "small"
    * Oh wait, finally, we don't handle negative numbers, if it is negative, return "negative"
    * */
  def numbersAndPrimes(number: Int): String = {
    number match {
      case 2 | 3 | 5 | 7 | 11 => "prime"
      case 0 => "zero"
      case n if n >= 10 => "large"
      case n if n < 10 && n > 0 => "small"
      case _ => "negative"
    }
  }


  sealed trait Color
  sealed trait PrimaryColor extends Color
  case object Red extends PrimaryColor
  case object Green extends PrimaryColor
  case object Blue extends PrimaryColor
  case object Yellow extends Color
  case object Magenta extends Color
  case object Cyan extends Color

  /** Tuples and Value objects
    * We defined a set of colors, where 'PrimaryColor's are 'Red', 'Green', 'Blue'.
    * Match a composition of 2 'PrimaryColor's and return the resulting 'Color'.
    * By default... is there a default case ?
    * */
  def composeColors(first: PrimaryColor, second: PrimaryColor): Color = {
    (first, second) match {
      case (Red, Blue) | (Blue, Red) => Magenta
      case (Red, Green) | (Green, Red) => Yellow
      case (Green, Blue) | (Blue, Green) => Cyan
      case (Red, Red) => Red
      case (Blue, Blue) => Blue
      case (Green, Green) => Green
    }
  }


  sealed trait Status
  case object Normal extends Status
  case object Safe extends Status
  case object Suspect extends Status
  case object Scammer extends Status
  case object Robot extends Status

  case class User(login: String, status: Status, ipUsage: Option[Int])

  sealed trait Decision
  case object Deny extends Decision
  case object Allow extends Decision

  /** Case classes and Options
    * Let's try to detect a malicious user, represented by the 'User' class. We'll return a decision, subclass of 'Decision'.
    * If the user has a status of 'Scammer' or 'Robot', return 'Deny'.
    * If the user has a status of 'Suspect' and we have IP address usage, with a value greater than 10, return 'Deny'
    * Else, return 'Allow'
    * */
  def detectMalicious(user: User): Decision = {
    user match {
      case User(_, Scammer, _) => Deny
      case User(_, Robot, _) => Deny
      case User(_, Suspect, Some(ip)) if ip > 10 => Deny
      case _ => Allow
    }
  }
}
