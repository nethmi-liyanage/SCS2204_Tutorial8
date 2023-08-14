import scala.io.StdIn._
object Labsheet8_Q1 {
  def main(args: Array[String]): Unit = {
    print("Enter deposit amount: ")
    val deposit = readDouble()
    val calculateInterest = (deposit: Double) => {
      deposit match {
        case amount if amount <= 20000 => amount * 0.02
        case amount if amount <= 200000 => amount * 0.04
        case amount if amount <= 2000000 => amount * 0.035
        case _ => deposit * 0.065
      }
    }
    println("The interest earned on the deposit is: " + calculateInterest(deposit))
  }

}