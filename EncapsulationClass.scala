package org.inceptez.scalaprograms
//Encapsulation is a concept of hiding the members and provide only the functionality using the members.
// Access specifiers (public, private, protected) and modifiers (val/var)
// Public class can access all public members, 
// Derived class can access protected members, 
// Companion object(object with same name of the class) can access private members
// Other members of the same Encapsulated class can also access public/protected/private members
// because of the above point through the public member of the base class, 
// can access the private/protected members indirectly - eg. of Encapsulation 
// Public class or object can access the private/protected indirectly using the other public member of the class eg. amtCanDispatched

// Question - When do we instantiate a base class or extend the base class?
// 1. If we extend, we can achieve all types of inheritance., if I instantiate I can't achieve inheritance provided if the base class is inherited 
// 2. Trait - we cant instantiate the trait class to access the member we only can extend
// 3. By extends we can access protected members. But using Obj instantiation, we can’t access protected members
// 4. If we extend a class we can achieve multilevel inheritance and access multiple members from parent & child class, but when we use obj we need to create multiple objects to access the members
// 5. We can extend a class by another derived class where both the classes are not instantitated yet, 
// but ready for instantiation later, where as if we instantiate the object will be created immediately by loading the class in the memory of the object created.

class EncapsulationClass 
{
 val street="CDS Street, Pallavaram, Chennai" // public
 protected val lockerroom="room3" // protected
 private val locker=1000000 // private
 val lockeramtpublic1=locker;
 private def amtCalc(amtneeded:Int):Int={return locker}
 
 def amtCanDispatched(amtneeded:Int):Boolean=
 {
    if (amtCalc(amtneeded)>amtneeded) true else false  }
 
/* val obj1=new EncapsulationClass;
 println(obj1.amtCanDispatched(10000))*/
 
 }

object EncapsulationClass
{ //companion object
  val obj1=new EncapsulationClass;
  //val tobj1=new trt1;
  println(" I am companion of Irfan - Irfan is residing in the street of " + obj1.street + " having locker room of number " 
        + obj1.lockerroom + " with amt of " + obj1.locker) // totally allowable
  val lockeramtpublic=obj1.locker;
  val x=obj1.amtCanDispatched(10000);
}

class SonClass extends EncapsulationClass { //only derived/inherited/child class can access the protected members of the base/parent
  println(" I am son of Irfan - Irfan is residing in the street of " + street + " having locker room of number " 
        + lockerroom + " with amt of "); 
        //+ locker) // not allowable
}

class EncapsulationClassObj extends EncapsulationClass{ // any class or objects can access the public members of a class.
    val x=100;
    
   // println(locker)
}

object SingleObject2 {
  def main(args:Array[String]){
    
    val obj1=new EncapsulationClass;
    val obj2=EncapsulationClass;
    //obj2.obj1.
    println(" I am a common man - Irfan is residing in the street of " + obj1.street + " having locker room of number " );
     //    + obj1.lockerroom + " with amt of " + obj1.locker) // not allowable
    
    println(" I am a common man - ATM is residing in the street of " + obj1.street +  
         " can I withdraw my amount or not" + obj1.amtCanDispatched(500000)) 
   
  
  val obj3=new EncapsulationClass;
  println(obj3.amtCanDispatched(1500000))
  }
}