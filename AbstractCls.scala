package org.inceptez.scalaprograms

abstract class AbstractCls(arg:Int) 
{
  def calc(num:Int,sym:String):Int= // method with implementation, where the complexities are taken care by the parent
  {
    if (sym=="s") 
    {
      return num*num
    }
    else if (sym=="c")
      return num*num*num
    else
      return arg
  }
  
  def battery(a:String):Int // unimplemented method
  //def speaker(a:String):Int // unimplemented method

  
}

class Child1 extends AbstractCls(0) // child inherits the parent to feel the abstraction
{
  val childval=100;
  
def battery(a:String):Int=
{
  if (a=="nica")
    return 100
  else
    return 200 }
}

object obj1{
  def main(a:Array[String]){
   val scalaobj1=new Child1;
   println("result of my program " + scalaobj1.calc(5, "x"));
   println(scalaobj1.battery("nica"))
  }
}