package option.exercice_0.model

case class UserUpdate
(
  id: Int,
  nickname: Option[String],
  gender: Option[Char],
  email: Option[String],
  emailValid: Option[Boolean],
  pictureCount: Option[Int],
  validPictureCount: Option[Int],
  preferences: Map[String, Boolean]
)
