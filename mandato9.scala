import scala.io.StdIn.readLine

object UserI extends App{

  var x = readLine()
  if (x < "1"){
    System.err.println(s"Invalid input, $x")
    }else{
    println(s"Good one, $x")
    }
  }
