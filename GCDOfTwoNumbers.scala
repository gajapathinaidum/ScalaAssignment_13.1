package acadgildclassesobjects

import com.sun.org.apache.xml.internal.utils.StringToIntTable

object GCDOfTwoNumbers {

  def main(args:Array[String])
  {
    val num1:Int=args(0).toInt;
    val num2:Int=args(1).toInt;
    var gcd=0;
    for(i<-1 to num1 if i<=num1 && i<=num2 && num1%i==0 && num2%i==0){
      gcd=i;
    } 
    println(s"The GCD of two numbers $num1 and $num2 is::"+gcd)
  }
}