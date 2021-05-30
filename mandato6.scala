object Num{
  def main(args: Array[String]){
  val x = args(0)
  if (x < "1"){
  System.err.println(s"Invalid input, $x")
    }else{
    println(s"Good one, $x")
    }
  }
}
