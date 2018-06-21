package pattern_matching.exercice_0

import pattern_matching.exercice_0.Basics._
import org.scalatest.{Matchers, WordSpec}

class BasicsSpec extends WordSpec with Matchers {

  "Basics getCityPopulation" should {

    "return the correct city population" in {
      Basics.getCityPopulation(Basics.knownCities(0)) should be (2206488)
      Basics.getCityPopulation(Basics.knownCities(1)) should be (13622267)
      Basics.getCityPopulation(Basics.knownCities(2)) should be (1548319)
      Basics.getCityPopulation(Basics.knownCities(3)) should be (1241)
    }
  }

  "Basics getTypeInFrench" should {

    "return french type for an Integer" in {
      Basics.getTypeInFrench(42) should be ("Entier")
    }

    "return french type for a String" in {
      Basics.getTypeInFrench("Bazinga") should be ("Chaîne")
    }

    "return french type for a Boolean" in {
      Basics.getTypeInFrench(true) should be ("Booléen")
      Basics.getTypeInFrench(false) should be ("Booléen")
    }

    "return french type for a Float" in {
      Basics.getTypeInFrench(125.6f) should be ("Flotant")
    }
  }

  "Basics numbersAndPrimes" should {

    "return 'prime' if number is one of the first 5 prime numbers" in {
      Basics.numbersAndPrimes(2) should be ("prime")
      Basics.numbersAndPrimes(3) should be ("prime")
      Basics.numbersAndPrimes(5) should be ("prime")
      Basics.numbersAndPrimes(7) should be ("prime")
      Basics.numbersAndPrimes(11) should be ("prime")
    }

    "return 'zero' if number is 0" in {
      Basics.numbersAndPrimes(0) should be ("zero")
    }

    "return 'large' if number is greater or equal than 10" in {
      Basics.numbersAndPrimes(10) should be ("large")
      Basics.numbersAndPrimes(12) should be ("large")
      Basics.numbersAndPrimes(123) should be ("large")
    }

    "return 'small' if number is less than 10" in {
      Basics.numbersAndPrimes(1) should be ("small")
      Basics.numbersAndPrimes(4) should be ("small")
      Basics.numbersAndPrimes(6) should be ("small")
      Basics.numbersAndPrimes(8) should be ("small")
      Basics.numbersAndPrimes(9) should be ("small")
    }

    "return 'negative' if number is negative" in {
      Basics.numbersAndPrimes(-1) should be ("negative")
      Basics.numbersAndPrimes(-121) should be ("negative")
    }
  }

  "Basics composeColors" should {

    "combine different colors" in {
      Basics.composeColors(Red, Blue) should be (Magenta)
      Basics.composeColors(Blue, Red) should be (Magenta)
      Basics.composeColors(Red, Green) should be (Yellow)
      Basics.composeColors(Green, Red) should be (Yellow)
      Basics.composeColors(Green, Blue) should be (Cyan)
      Basics.composeColors(Blue, Green) should be (Cyan)
    }

    "combine same colors" in {
      Basics.composeColors(Red, Red) should be (Red)
      Basics.composeColors(Blue, Blue) should be (Blue)
      Basics.composeColors(Green, Green) should be (Green)
    }
  }

  "Basics detectMalicious" should {

    "deny a Scammer or Robot" in {
      Basics.detectMalicious(User("Harry", Scammer, None)) should be (Deny)
      Basics.detectMalicious(User("Mr", Robot, None)) should be (Deny)
      Basics.detectMalicious(User("Bender", Robot, Some(42))) should be (Deny)
    }

    "deny a Suspect with IP usage greater than 10" in {
      Basics.detectMalicious(User("Mustard", Suspect, Some(21))) should be (Deny)
    }

    "allow others" in {
      Basics.detectMalicious(User("Dora", Suspect, Some(9))) should be (Allow)
      Basics.detectMalicious(User("John", Suspect, None)) should be (Allow)
      Basics.detectMalicious(User("Rick", Normal, None)) should be (Allow)
      Basics.detectMalicious(User("Morty", Normal, Some(13))) should be (Allow)
      Basics.detectMalicious(User("Alan", Safe, None)) should be (Allow)
      Basics.detectMalicious(User("Ellie", Safe, Some(27))) should be (Allow)

    }
  }
}
