package collection.exercice_0.model

case class Movie(
  name: String, releaseYear: Int, director: Director, genre: List[Genre], price: Double = 0
)



