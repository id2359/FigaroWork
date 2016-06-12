import com.cra.figaro.language._

import com.cra.figaro.algorithm.sampling._

object HelloWorldTest {
  def main(args: Array[String]) {
      val helloWorldElement = Select(0.8 ->"Hello world!", 0.2->"Goodbye world!")
      val sampleHelloWorld = Importance(1000, helloWorldElement)
      
      sampleHelloWorld.start()
      println("Probability of Hello world:")
      println(sampleHelloWorld.probability(helloWorldElement, "Hello world!"))
      println("Probability of Goodbye world:")
      println(sampleHelloWorld.probability(helloWorldElement, "Goodbye world!"))

      


  }
}
