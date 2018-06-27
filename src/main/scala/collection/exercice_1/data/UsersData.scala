package collection.exercice_1.data

object UsersData {

  val john: Map[String, Any] = Map(
    "profile.nickname" -> "john",
    "profile.gender" -> 'M',
    "profile.email" -> "john@gmail.com",
    "tracking.site" -> "exercices.com",
    "tracking.platform" -> "mobile",
    "photo.count" -> 2,
    "photo.validCount" -> 0
  )

  val mary: Map[String, Any] = Map(
    "profile.nickname" -> "mary",
    "profile.gender" -> 'F',
    "profile.email" -> "mary@gmail.com",
    "photo.count" -> 3,
    "photo.validCount" -> 3
  )

  val jack: Map[String, Any] = Map(
    "profile.nickname" -> "jack",
    "profile.gender" -> 'M',
    "tracking.site" -> "exercices.com",
    "tracking.platform" -> "desktop",
    "photo.count" -> 5,
    "photo.validCount" -> 4
  )

  val sarah: Map[String, Any] = Map(
    "profile.nickname" -> "sarah",
    "profile.gender" -> 'F',
    "profile.email" -> "sara@gmail.com",
    "tracking.site" -> "exercices.com",
    "photo.count" -> 1,
    "photo.validCount" -> 1
  )

  val users: Map[Int, Map[String, Any]] = Map(
    111 -> john,
    222 -> mary,
    333 -> jack,
    444 -> sarah
  )
}
