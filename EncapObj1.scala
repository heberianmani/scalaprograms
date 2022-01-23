package org.inceptez.scalaprograms

object EncapObj1 extends org.inceptez.scalaprograms.EncapsClass // extending because only child can access the parent protected members
{
  
  def main(a:Array[String]){
    println(lockerroom) //protected members can be accessed by the inherited child classes
    println(street)
    println(canIWithdraw(5000000))
    //pritnln(khazanabalance) //private members cannot be accessed even by the inherited child classes
    val obj1=new org.inceptez.scalaprograms.EncapsClass;
    println(obj1.street) // public members can be accessed by any one who is instantiating the class
    //println(obj1.y)
    println(obj1.canIWithdraw(5000000)) //through public member, any one can access the private or protected values.
  


}

}