package exercice_2

sealed trait Decoration { def price: Int }
case object Ball extends Decoration { override val price: Int = 10 }
case object Light extends Decoration { override val price: Int = 5 }
case object Star extends Decoration { override val price: Int = 35 }

sealed trait Tree
case class Branch(left: Option[Tree], right: Option[Tree]) extends Tree
case class Leaf(decoration: Option[Decoration]) extends Tree

object ChristmasTree {

  def computePrice(tree: Tree): Int = {
    tree match {
      case Leaf(None) => 0
      case Leaf(Some(decoration: Decoration)) => decoration.price
      case Branch(None, None) => 0
      case Branch(Some(left), None) => computePrice(left)
      case Branch(None, Some(right)) => computePrice(right)
      case Branch(Some(left), Some(right)) => computePrice(left) + computePrice(right)
    }
  }

  val barrenTree: Tree =
    Branch(
      Some(Branch(
        Some(Branch(
          Some(Leaf(
            Some(Star)
          )),
          None
        )),
        None
      )),
      None
    )

  val beautifulTree: Tree =
    Branch(
      Some(Branch(
        Some(Branch(
          Some(Branch(
            Some(Leaf(
              Some(Star)
            )),
            Some(Leaf(
              Some(Ball)
            ))
          )),
          Some(Leaf(
            Some(Ball)
          ))
        )),
        Some(Branch(
          Some(Leaf(
            Some(Light)
          )),
          Some(Leaf(
            Some(Ball)
          ))
        ))
      )),
      Some(Leaf(
        Some(Light)
      ))
    )
}