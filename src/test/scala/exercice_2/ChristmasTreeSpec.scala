package exercice_2

import org.scalatest.{Matchers, WordSpec}

class ChristmasTreeSpec extends WordSpec with Matchers {

  "ChristmasTree price calculator" should {

    "compute price for example trees" in {
      ChristmasTree.computePrice(ChristmasTree.barrenTree) should be (Star.price)
      ChristmasTree.computePrice(ChristmasTree.beautifulTree) should be (Star.price + 2 * Light.price + 3 * Ball.price)
    }

    "compute price of an empty leaf" in {
      ChristmasTree.computePrice(Leaf(None)) should be (0)
    }

    "compute price of a decorated leaf" in {
      ChristmasTree.computePrice(Leaf(Some(Ball))) should be (Ball.price)
      ChristmasTree.computePrice(Leaf(Some(Light))) should be (Light.price)
      ChristmasTree.computePrice(Leaf(Some(Star))) should be (Star.price)
    }

    "compute price for an empty branch" in {
      ChristmasTree.computePrice(Branch(None, None)) should be (0)
    }

    "compute price for a branch with a leaf" in {
      ChristmasTree.computePrice(Branch(Some(Leaf(Some(Ball))), None)) should be (Ball.price)
      ChristmasTree.computePrice(Branch(None, Some(Leaf(Some(Star))))) should be (Star.price)
    }

    "compute price for a branch with two leaves" in {
      ChristmasTree.computePrice(Branch(Some(Leaf(Some(Star))), Some(Leaf(Some(Ball))))) should be (Star.price + Ball.price)
      ChristmasTree.computePrice(Branch(Some(Leaf(Some(Ball))), Some(Leaf(Some(Star))))) should be (Star.price + Ball.price)
    }
  }
}
