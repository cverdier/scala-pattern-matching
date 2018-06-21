package collection.exercice_0.model

/*
 * A sealed trait can be extended only in the same file as its declaration.
 */
sealed trait Director

/*
 * This is the companion-object of the trait Director. This is also a common way to handle enumerated values in scala
 */
object Director {

  object Kurosawa extends Director {
    override def toString: String = "Kurosawa"
  }

  object Hitchcock extends Director {
    override def toString: String = "Hitchcock"
  }

  object Spielberg extends Director {
    override def toString: String = "Spielberg"
  }

  object Kubrick extends Director {
    override def toString: String = "Kubrick"
  }

  object RandomDirector extends Director {
    override def toString: String = "does_not_matter"
  }

}