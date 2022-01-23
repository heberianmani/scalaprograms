package org.inceptez.scalaprograms

//public(method/variables) -> can be accessible by all 
//private(method/variables) -> can be access with in the same class 
// or we can access by companion object -> by instantiating the class creating an object. 
//protected(method/variables) -> can be access only with in same class/object or by child/sub class i.e. by extending property

class EncapsClass {
  private val khazanabalance=1000000; //private
  protected val lockerroom="room1"; //protected
  val street="Main street"; //public

  // creating a public method to make use of my private or protected members indirectly.
  def canIWithdraw(amt:Int):Boolean=
  {
    if (khazanabalance-amt>0) 
      true 
    else 
      false
  }
}


object EncapsClass
{ // companion object is an object created with the same name of the class inline in the same package as a single program
  def main(a:Array[String])
  {
    //println(khazanabalance)
  val obj1=new EncapsClass;
  println(obj1.khazanabalance)
}
}
