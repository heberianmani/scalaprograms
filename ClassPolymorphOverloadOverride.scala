package org.inceptez.scalaprograms

class ClassPolymorphOverloadOverride {
  def met1(sal:Int)=sal+1000;
}

class ClassOverride1(bonus:Int) extends ClassPolymorphOverloadOverride{
  
  override def met1(sal:Int)=sal+bonus; //overriding, the signature has to be same as like the method in the parent class (run time polymorphism)
  def met1(sal:Int,bonus:Int)=sal+bonus; //overloading (compile time polymorphism)
  def met1(sal:Double)=(sal+bonus); //overloading (compile time polymorphism)
}

object SingleObjj1{
  def main(args:Array[String]){
    val obj1=new ClassOverride1(2000)
  println(obj1.met1(10000))
  println(obj1.met1(10000,3000))
  }
}