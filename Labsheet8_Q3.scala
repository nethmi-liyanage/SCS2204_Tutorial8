import scala.io.StdIn
object Labsheet8_Q3 {
  def format(names: List[String], formatFunction: String => String): List[String] = {
    names.map(formatFunction)
  }

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    print("Upper: 1 \nLower: 2 \nEnter case:  ")
    val Case = scala.io.StdIn.readInt()

    val formatCase = (str: String) => {
      Case match {
        case 1 => str.toUpperCase()
        case 2 => str.toLowerCase()
      }
    }

    println("\nAfter changing:")
    format(names, formatCase).foreach(println)
  }
}
