package org.inceptez.scalaprograms

abstract class AbstractionClassProgram { // Abstraction - abstract, traits
  val property1="A";
  //def vacandLand(x:String):Int={return 100}; //implemented member
  //def vacandLand(x:String):Int; //un implemented member
}

trait tr1{
  val property2="C";
}

trait tr2{
  val property3="D";
}

class ChildClass extends AbstractionClassProgram with tr1 with tr2 //// Abstraction  is hiding of functionalities with complexities, but just make use of it
{
  val property4="B "+property1; 
//  def vacandLand(x:String):Int=return 1000;
}

object SingleObj1{
  def main(args:Array[String])
  { 
  val obj1=new ChildClass;
  println(obj1.property4)
  //val obj2=new AbstractionClassProgram // not possible because the class1 is abstracted.
  //println(obj2.property1)
  val obj3=new ChildClass // not possible because the class1 is abstracted.
  println(obj3.property1)
  
  val obj4=new CalcClass // possible because this class is inherited the abstracted class
  println(obj4.batterymah)
  println(obj4.res)
  
  }
}

abstract class battery(typ:String) { // Abstraction - abstract, traits
  def batMah(typ:String):Int= 
  {if(typ=="nica") return 100 else return 200}
  
  def charge:Int;
}

trait display{ // Abstraction - abstract, traits
  
  def resolution(typ:String):String={if(typ=="hd") return "1800p" else return "4k"}; //implemented member
  def display1:Int;
}

class CalcClass extends battery("nica") with display 
// Abstraction  is hiding of functionalities with complexities, but just make use of it through the derived class
{
  def charge:Int=return 80;
  def display1:Int=return 100;
 val batterymah=batMah("nica"); 
 val res=resolution("hd")
}



