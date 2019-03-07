package algorithmia.helloworldscala

import org.scalatest._

class helloworldscalaSpec extends FlatSpec with Matchers {
  "Initial helloworldscala algorithm" should "return Hello plus input" in {
    val algorithm = new helloworldscala()
    "Hello Bob" shouldEqual algorithm.apply("Bob")
  }
}
