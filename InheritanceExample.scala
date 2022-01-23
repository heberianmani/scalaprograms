package org.inceptez.scalaprograms


class ParentClass1 
{
  val fatheramt=100;
 // def land(a:Int):Int; // unimplemented method
}

class ParentClass2 extends ParentClass1
{
  val motheramt=50;
}

// example for single inheritance
class ChildClass1 extends ParentClass1 
{ //single inheritance
  val child1amt=10;
  val father_childamt=fatheramt+child1amt;
}

// example for multi level inheritance
class ChildClass2 extends ParentClass2 
{ //single inheritance
  val child1amt=10;
  val father_mother_childamt=fatheramt+motheramt+child1amt;
}

// to learn what is multiple inheritance, go through below.
trait ParentTrait2 // i can't be seperately instantiated, i can't be passed with args
{
  val motheramt=50;
  //def battery(a:String):Int
}

trait BroTrait3 // i can't be seperately instantiated, i can't be passed with args
{
  val bro=50;
}

// example for multiple inheritance
class ChildClass3 extends ParentClass1 with ParentTrait2 with BroTrait3
{ //multiple inheritance
  val child1amt=10;
  val father_mother_bro_childamt=fatheramt+motheramt+bro+child1amt;
  def battery(a:String):Int=
{
  if (a=="nica")
    return 100
  else
    return 200 }
}

object SinglObj{
  def main(a:Array[String]){
   val scalaobj1=new  ChildClass3;
   println("my family members amt = " + scalaobj1.father_mother_bro_childamt)
  }
}
