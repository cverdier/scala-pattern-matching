package collection.exercice_1

object Personalizer {


  def getEmailsWithValidPhoto(users: Map[Int, Map[String, Any]]): List[Any] = {
    ???
  }

  def getPathsByDomain(users: Map[Int, Map[String, Any]]): Map[String, Set[String]] = {
    ???
  }


  type Personalization = Map[String, Option[Any]]

  def getUsersPersonalization(users: Map[Int, Map[String, Any]], requests: Map[Int, String]): Map[Int, Personalization] = {
    ???
  }

  def getMultiplePersonalizationsForUser(users: Map[Int, Map[String, Any]], id: Int, requests: List[Set[String]]): List[Personalization] = {
    ???
  }
}
