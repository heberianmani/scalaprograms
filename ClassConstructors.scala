package org.inceptez.scalaprograms

class ClassConstructors(bonus:Int,a:Int) {
  
  def this() // auxilary constructor
  {
    this(1000,100)
  }
  
    def this(bonus:Int) // auxilary constructor
  {
    this(bonus,300)
  }
  
  def bonusCalc(sal:Int):Int=sal+bonus;
}

object SingleObj111{
  def main(args:Array[String]){
    
    val ITobj1=new ClassConstructors(); //primary constructor
    
    println("Irfan "+ITobj1.bonusCalc(10000));
    println("Srinivas "+ITobj1.bonusCalc(15000));
    
    val Acctsobj1=new ClassConstructors(3000); //auxilary constructor
    println("Satinder "+Acctsobj1.bonusCalc(8000));
    println("Karthikeyan "+Acctsobj1.bonusCalc(12000));   
    
    val Othersobj1=new ClassConstructors; //auxilary constructor
    println("Konesh "+Othersobj1.bonusCalc(20000));
    println("Ram "+Othersobj1.bonusCalc(25000));   
    
    
  }
}