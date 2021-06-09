import scala.io.StdIn.readLine

object UserI extends App{

var vCont = 0;
var vInput = readLine()

while(vInput != ""){
  try{
  vCont = vCont+vInput.toInt
  vInput =  readLine()

  }catch{
  case ex: NumberFormatException =>
  System.err.println(s"Invalid vInput, $vInput")
  vInput = readLine()
  }
  }
  println(vCont)
  println("")
}
