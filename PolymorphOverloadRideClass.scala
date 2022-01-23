package org.inceptez.scalaprograms

class PolymorphOverloadRideClass {
  
  // A method with different in number of parms or type is called overloading.
  def method11(a:Int):Int={return a+100}
  def method11(a:Int,b:Int):Int={return a+b}
  
  //overriding - When a class inherits from another class, 
  // it may want to modify the definition for a member of the superclass or provide a new version of it.
 
  def override1(a:Int,b:Int):Int={return a+b}
  
  val x=100;
}

class ChildClass111 extends  PolymorphOverloadRideClass { 
  
 override def override1(a:Int,b:Int):Int={return a+b+100};
 override val x=100+200;
 
}

object SingleObject extends  PolymorphOverloadRideClass{
  override def override1(a:Int,b:Int):Int={return a+b+100};
  def main(args:Array[String])
  {     
   val obj10=new PolymorphOverloadRideClass;
   println(obj10.method11(200))
   println(obj10.method11(200,300))
  }
  }
