package org.inceptez.scalaprograms

class ConstructorClass(model:String,costperhour:Int) { // Primary Constructor
   
  //Auxilary Constructor1
  def this(model:String){
    this(model,15)
  }
  
  
  //Auxilary Constructor2
  def this(){
    
    this("NA",15) 
    }
  
def installationcost(hoursforinstallation:Int):Int=
{
println("Total cost of installation for " + model + " model phone for hours of " + hoursforinstallation + " with total cost " +
 hoursforinstallation*costperhour)
return hoursforinstallation*costperhour
}
  
def quality:String=
{
return "high"
}
  
}

object CallCenterAgent1{
  def main(args:Array[String]){
    
    val objrotary1=new ConstructorClass("rotary",10); // Primary Constructor - If we instantiate with all required args 
    println(" Customer Irfan, the cost is " + objrotary1.installationcost(5));
    
    val objinternet=new ConstructorClass("internet",15); // Primary Constructor - If we instantiate with all required args
    println(" Customer John, the cost is " + objinternet.installationcost(10));
    
    val objcommonconnection=new ConstructorClass("common"); // Auxilary Constructor1 - If we instantiate with few args, the aux cons will be called internally
    println(" Customer Divya, the cost is " + objcommonconnection.installationcost(6));
    
    val objunkconnection=new ConstructorClass(); // Auxilary Constructor2 - If we instantiate with few args, the aux cons will be called internally
    println(" Customer Dinesh, the cost is " + objunkconnection.installationcost(7));
  }
}