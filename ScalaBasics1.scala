package org.inceptez.scalaprograms

object ScalaBasics1 {
    //main method is the entry point of the scala program
  //To change the font size - General → Appearance → Colors and Fonts → Basic → Text Font

  def main(args:Array[String])  {
    // Few Basic Best Practices:
    //Names used can be either UpperCamelCase or lowerCamelCase
    //camel case is combination of upper and lower case without any spaces 
    // eg - lowerCamelCase (starts with lowercase), UpperCamelCase (starts with uppercase)
    // Use UpperCamelCase for Classnames, objectnames and types - ScalaClass1
    // Use lowerCamelCase for variables and methods - bonusCalc(), reduceByKey()
    // Case sensitive val a=100 is different from val A=100
    // Block Expressions can be in {}
    //semicolon is optional, but can be used as a statement terminator if you use multiple statements in a single line.
    //single line and /* */ multi line comments

        print("Hello all ")
        println("Welcome to Scala...")
        println("Welcome to Inceptez \t Technologies..")

        /*Two types of variables
    		1. Mutable Variable - can change value
    		2. Immutable Value - only assign value, cannot change 
    * */

        /*if (2>1)
        {
        	println("1 is greater")
        	println("end of program")
        }  */      
        
    val bonus:Int = 1000
    var salary:Int = 20000
    
   //bonus = 2000
    
    //Not allowed to reassign value because declared as val
    
    //Able to reassign value because declared as var
    
    salary = bonus + salary;
    
    println("Variable Types..")
    
    
    /*
    
    In Scala, there are 2 different value types
    
    1. value type (simple datatype)
    2. reference type (collection type or program reference)
    */
      
    
    //******DataType - valuetype**************/
      
    
    //Byte: Byte is an 8 bit signed value.The value ranges from -128 to 127
    val num0:Byte = 100
    println("Num0 of Byte type is " + num0);
    //Short: is an 16 bit signed value ranging from -32768 to 32767
    val num1:Short = 10
    
    //Int: is an 32 bit signed value ranging from -2147483648 to 2147483647
    val num2:Int = 100
    
    //Long: is a 64 bit signed value ranging from -9223372036854775808 to 9223372036854775807
    val num3:Long = 100
    
    //Float: is a 32 bit floating point ranges 6-7 decimal digits precision
    val num4:Float = 250.25f
    
    //Double: is a 64 bit double with 15-16 decimal digits precision
    val num5:Double = 250.25
    
    //Boolean: literal with true and false values
    val bstr:Boolean = true
    
    //Char: is a 16 bit unsigned unicode character ranging from U+0000 to U+FFFF.
    val cstr:Char = 'A'
        
    //Unit: Corresponds to no value
    val str4:Unit = ()
 
   //AnyVal: is the root class of all value types
   
    val av1:AnyVal = 10
    val av2:AnyVal = 10.0
    val av3:AnyVal = 'D'
    val av4:AnyVal = ()
    
    val a1:AnyVal = 10

    var avar1:AnyVal=0
    avar1=10.2f
    
  
    /******DataTypes - Reference type**************/

    //null or _ corresponds to unknown value
    
    var unk:String=null
    println("Unknown unk="+unk)
    unk="Inceptez"
    println("reassigned unk="+unk)
    // why string is falling under the collection type or reference type
    unk.foreach(println)
    
    //String: A sequence of characters enclosed with double quotes.
    val str2:AnyRef = "xybbdxx"
    val str22:AnyVal= 10

    //All custom objects are reference type 
    
    /******DataTypes - Any type**************/
    
    //Any: Super type of any value or reference type
    val atype1:Any = "Inceptez"
    val atype2:Any = 100
    val atype3:Any = 200.50
    val atype4:Any = 'G'
    val atype5:Any = null
    
   /*Type Inference - compiler can infer the datatype based on the assignment 
    
    * */	
    println("Dynamic Type Inference..")
    val a = 10
    var b = 20.0

    //statically typed -  each variable and expression is already known at compile time
    //cannot assign different datatype once the value is assigned
    var name = "Inceptez"
    name = "Inceptez Technologies Pvt Ltd"
    println(name)
    //name = 25  // this is not possible because we are trying to change the statically typed variable 
    name=25.toString() // this is possible because we are trying to change the datatype of the value as per the statically typed variable
    println("Statically Type..")
    
println("Operators")

//Arithmetic
val ara=10+20
println("ara="+ara)
val arb=11%2.0
println("arb="+arb)

//Assignment    
val asa=100.1 //Assignment
var asb=200 //Assignment
asb=400 //Re Assignment
asb+=300 // Re Assignment with the Arithmetic operation this is equivalent to asb=asb+300

println("asb is reassigned as "+asb)    

//Relational (Comparison)
println(asa==asb)
if(asa!=asb)
  println("both asa and asb are not same ")
println(asa<=asb)

//Logical
if(!(asa==10 && asb>20) || arb==0)
{ println("Blockwise checked - Either both conditions matched or arb==0") }
//irfan -> irfan
//irfan -> 01001

//Bitwise 
//32 16 8 4 2 1 -- convert to bits based on the value
if((asa==10 & asb>20) | arb==0)
{ println("Bitwise checked - Either both conditions matched or arb==0") }

  }
  
  }



