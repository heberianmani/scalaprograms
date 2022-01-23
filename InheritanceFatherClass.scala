package org.inceptez.scalaprograms

// types of classes - class, singleton object, abstract, traits, case class

class InheritanceFatherClass(x:Int) {
  val amount1=100;  
}


class DerivedSonClass extends InheritanceFatherClass(10) //Single Inheritance
{
  val amount2=50;
  val amounta=amount1+amount2;
}


class DerivedSonsDaughterClass extends DerivedSonClass //Multi Level Inheritance
{
  
  val amount3=10;
  
  val amountb=amount1+amount2+amount3;
}


trait InheritanceMotherClass {
  val amount4=150;  
}

trait InheritanceSisterClass {
  val amount5=30;  
}

//class DerivedSon2Class extends InheritanceFatherClass with InheritanceMotherClass{ 
  // multiple inheritance can't be achieved with just a class or abstract class, but only achieved using traits.
class DerivedSon2Class extends InheritanceFatherClass(0) with InheritanceMotherClass with InheritanceSisterClass
{ 
  val amount6=20;
  val amountc=amount1+amount4+amount5+amount6;
}

//application of inheritance

class internet{
  val speed=1;
}

trait telephone {
  val voice=1;
}

class consumer extends internet{ //single
  val c=1;
}

class consumer1 extends consumer  { // rt eg. for multilevel inheritance.
  val c1=1
  val c4=c1+c+speed;
}

class consumer2 extends internet with telephone { // rt eg. for multiple inheritance.
  val c1=1;
}





















