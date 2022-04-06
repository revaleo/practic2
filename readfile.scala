
import java.io._
import scala.io.StdIn.readLine
import scala.collection.mutable._


object readfile extends App {
  val credentials = Seq(("leo", "123"), ("maria", "456"))
  var auth = false

  while (auth == false) {
    println("Please enter your username:")
  val username = readLine()
  println("Please enter your password:")
  val pwd =readLine()
    val input = (username, pwd)

  //authentication
  if (credentials.contains(input)) {
    auth = true
  } else
    println("Wrong username and password")
  }
  //read/write files
  if(auth)
  {
    val text = scala.io.Source.fromFile("sample_file").mkString
    println(text)
    val text1 = text.toUpperCase()
    new PrintWriter("written_file.txt") {
      write(text1);  close}
  }
  }