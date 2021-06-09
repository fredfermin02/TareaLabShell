import scala.io.StdIn.readLine

object UserI extends App{
var vCont = 0
var vInput = readLine()

while(vInput != ""){
try{
if (vInput > "0"){
vCont = vInput.toInt* vInput.toInt
println(vCont)
vInput = readLine()
}
}catch{
case ex: NumberFormatException =>
System.err.println(s"Invalid input, $vInput")
vInput = readLine()
}
}
println("")
}
