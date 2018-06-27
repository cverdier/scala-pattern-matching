package collection.exercice_0

import collection.exercice_0.model.Director.{Hitchcock, Kurosawa}
import collection.exercice_0.model.Genre._
import collection.exercice_0.model.{Director, Genre, Movie}

object Movies {

  val someMovies = List(
    Movie("Ran", 1985, Kurosawa, List(Action, Drama, War), 2.3),
    Movie("Rashomon", 1950, Kurosawa, List(Crime, Drama), 3.0),
    Movie("Psycho", 1960, Hitchcock, List(Horror, Mistery, Thriller), 2.7),
    Movie("Vertigo", 1958, Hitchcock, List(Mistery, Romance, Thriller), 5.1)
  )

  /**
    * Return movies directed by the given director
    */
  def getMoviesMadeBy(movies: List[Movie], director: Director): List[Movie] =
    movies.filter(_.director == director)

  case class MovieRelease(name: String, releaseYear: Int)

  /**
    * Return MovieRelease for each Movie in the list, sort by release year (ascending)
    */
  def getSortedMovieReleases(movies: List[Movie]): List[MovieRelease] =
    movies.map(movie => MovieRelease(movie.name, movie.releaseYear))
    .sortBy(_.releaseYear)

  /**
    * Return a list of movies matching all given predicates
    */
  def getMoviesWithMultipleFilters(movies: List[Movie])(filters: List[Movie => Boolean]): List[Movie] =
    movies.filter(movie =>
      filters.forall(_(movie)))

  /**
    * Return a discount for each movie according to the following rules:
    * - 35% reduction if price is only multiple of 3
    * - 40% reduction if price is only multiple of 5
    * - 50% reduction if price is both multiple of 5 and 3
    * - 0% reduction otherwise
    * note: you can define a tuple like this: "x => (x + 2, x * 2)"
    * note: you can use pattern matching on a tuple "case (2, 4) => ..."
    */
  def discounts(movies: List[Movie]): List[Double] = ???

  /**
    * Apply the given n-th discount in the 'discounts' list to the n-th movie in the movies list
    */
  def givenDiscounts(movies: List[Movie], discounts: List[Double]): List[Movie] = ???

  /**
    * Return the sum of the prices of the movies
    * note: use List#foldLeft
    */
  def sumPrices(movies: List[Movie]): Double = ???

  /**
    * Return the count of movies for each Genre
    * note: use List#flatMap or List#flatten, and List#foldLeft
    */
  def genreCount(movies: List[Movie]): Map[Genre, Int] = ???
}
