package collection.exercice_0

import collection.exercice_0.Movies.MovieRelease
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

    "retrieve releases sorted by year" in {
      val result = Movies.getSortedMovieReleases(Movies.someMovies)

      result should be(List(
        MovieRelease("Rashomon", 1950),
        MovieRelease("Vertigo", 1958),
        MovieRelease("Psycho", 1960),
        MovieRelease("Ran", 1985)
      ))
    }
  }
}
