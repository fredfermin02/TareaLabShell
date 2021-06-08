object Num{
  def main(args: Array[String]){

  var vCont = 0
  var vInput = args(0)

  if (vInput<"0" || vInput > "-1"){
    while(vCont < vInput.toInt){
    vCont = vCont +1;
    println(vCont);
    }
    }else{
    System.err.println(s"Invalid input, $vInput")
    }

  println("")
  }
}
