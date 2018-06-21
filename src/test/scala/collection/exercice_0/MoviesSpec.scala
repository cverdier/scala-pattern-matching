package collection.exercice_0

import collection.exercice_0.model.Director
import org.scalatest.{Matchers, WordSpec}

class MoviesSpec extends WordSpec with Matchers {
  "a Movies" should{
    "filter movies by director" in {
      val result = Movies.getMoviesMadeBy(Movies.someMovies, Director.Hitchcock)

      result.map(_.name) should be(List(
        "Psycho",
        "Vertigo"
      ))
    }
  }
}
