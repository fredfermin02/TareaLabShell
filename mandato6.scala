object Num{
  def main(args: Array[String]){
  var x = args(0)
  if (x < "1"){
  System.err.println(s"Invalid input, $x")
    }else{
    println(s"Good one, $x")
    }
  }
}
