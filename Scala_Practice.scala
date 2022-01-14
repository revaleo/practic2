import scala.Console.{BOLD, RESET, UNDERLINED}
import scala.io.StdIn.readLine

object Scala_Practice {
  var name: String = ""
  var age: String = ""
  var movie: String = ""

  //1.
  def Q1() = {
    println(
      """{
        |"donut_name":"Vanilla Donut",
        |"quantity_purchased":"10",
        |"price":2.5
        |}""".stripMargin)
  }
  //in main, call Q1

  //2.
  def Q2(): Unit = {
    println("Please enter your name: ")
    name = readLine()
    println("Please enter your age: ")
    age = readLine()
    println(f"${BOLD}Name:${RESET} ${UNDERLINED}$name${RESET}\n${BOLD}Age:${RESET} $age")
  }
  //in main, call Q2

  //3.
  def Q3(s: String): Char = {
    s.charAt(7)
  }
  //in main, println(Q3("http://allaboutscala"))

  //4.
  def Q4(): Unit = {
    val price = 2.5
    val qty = 10
    println(f"The total cost of Glazed Donuts is ${price * qty}%1.2f")
  }

  //5.
  def Q5 = {
    println("What is your favorite movie of all times?")
    movie = readLine()
  }

  //in main call Q5
  //6.
  def Q6: Unit = {
    println("First Name: Leo\nLast Name: Chen\nFavorite Movie: The Matrix")
  }
  //in main call Q6

  def Q7(s: String): Unit = {
    val pattern = "([A-Za-z ]+) ([0-9]+) ([0-9]+.[0-9]{2})".r
    val pattern(donut, qty, price) = s
    val price1 = price.toDouble
    val qty1 = qty.toInt
    println(s"Donut Name: $donut")
    println(f"Donut Price: $$$price1%1.2f")
    println(s"Donut Purchased: $qty1")
  }
  //in main call Q7("Vanilla Donut 10 2.25")

  //8.
  def Q8(): Unit = {
    val a = Map("Bill" -> 9, "Jonny" -> 8, "Tommy" -> 11, "Cindy" -> 13)
    val b = a.toSeq.sortBy(-_._2).toMap.mkString(",")
    println("Children to ages in reverse order by their names = " + b)
  }
  //in main call Q8

  //9.
  def Q9(): Unit = {
    val basketone = Set("Cake", "Milk", "Cheese", "Toilet Paper")
    val baskettwo = Set("Bread", "Water", "Juice", "Milk", "Cheese")
    val common = basketone.intersect(baskettwo)
    println("Shopping Basket One = " + basketone.mkString("-"))
    println("Shopping Basket Two = " + baskettwo.mkString("-"))
    println("Common items are:\n" + common.mkString("\n"))
  }

  //10.
  def Q10(): Unit = {

    print("Number range from 100 to 110 inclusive = " + (100 to 110).mkString(" "))
  }


  def main(args: Array[String]): Unit = {
    Q1
  }
}
