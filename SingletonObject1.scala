package org.inceptez.scalaprograms

object SingletonObject1{
  def main(args:Array[String]){

    //val fattherobj1=new InheritanceFatherClass;
    //println(fattherobj1.amount1);
    
    val daughterobj1=new DerivedSonsDaughterClass;
    println(daughterobj1.amount1)
    println(daughterobj1.amount2);
    println(daughterobj1.amount3);
  }
}