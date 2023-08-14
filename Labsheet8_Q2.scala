import scala.io.StdIn

object Labsheet8_Q2 {
  val filterNum : Int => String = (num : Int) => num match{
    case num if num <= 0 => "Negative/Zero"
    case num if num%2 == 0 => "Even"
    case _ => "Odd"
  }

  def main(args: Array[String]): Unit = {
    print("Enter a number: ")
    val n =scala.io.StdIn.readInt()
    print("The entered number is: "+ filterNum(n))
  }
}