package org.inceptez.scalaprograms

object ScalaPatternExceptionMatch5 {
 
  /*Pattern matching is a way of checking the given sequence of tokens for the presence of the 
   * specific pattern.
   * It is a technique for checking a value against a pattern. 
  */
 
  def main(args:Array[String]):Unit =
  {
 
    /*Exception handling is a mechanism which is used to handle abnormal conditions.
  * Avoid termination of your program unexpectedly.
 */
    
    try
    {
         val y=10/0;
         println("first statement executed and result is : " + y);
         val empid=Array(0,20,30);
         if( empid.size < 3)
         {
         val arrval=empid(3);
          val yy=empid.length;
         }
         // Custom exception handling
         if(empid(0)==0)
         {
           println("Calling custom exception")
         throw new Exception()
         }
         val x = 10/1
         println("All statements executed");
         //println(y)
        
         
    }
     catch
    { 
        case a:java.lang.ArrayIndexOutOfBoundsException => 
        {
            println("array index exception occured" + a)
            println("I will be executed when error occured");
            println("calling test method with param as 2") 
            //println(testmatch(2));
            
        }
        case b:ArithmeticException => 
        {
            println("arithematic exception occured" + a)
            println("I will be executed when error occured");
            println("calling test method with param as 2") 
            //println(testmatch(2));
            
        }
      case c:java.lang.Exception => 
        {
            println("Some exception occured" + b)
            println("I will be executed when error occured");
            println("calling test method with param as 2") 
            //println(testmatch(2));
            
        }
                      
    }
    
     finally{
       println("Cleaning up all resources like files, connections, values or objects")
     }
    
    
  }
  

    // method containing match keyword 
def testmatch(x:Int) = x match 
   { 
       // if value of x is 0, 
       // this case will be executed 
       case 0  => "Hello, Techies"
         
       // if value of x is 1,  
       // this case will be executed 
       case 1 => "Are you learning Scala?"
         
       // if x doesnt match any sequence, 
       // then this case will be executed 
       case _ => "Good Luck!!"
   }

def testmatchif(x:Int):String =  
   { 
       // if value of x is 0, 
       // this case will be executed 
       if (x==0) "Hello, Techies"
         
       // if value of x is 1,  
       // this case will be executed 
       else if (x==1)  "Are you learning Scala?"
         
       // if x doesnt match any sequence, 
       // then this case will be executed 
       else "Good Luck!!"
   }
  
         
def calculator(a:Int,b:Int,op:String):Int = 
       op match
        {
    
          case "add" | "addition" =>
            {
              println("Add Numbers")
              a + b
            }
          case "sub" | "subtract" =>
          {
            println("Sub Numbers")
            a - b
          }
          case "mul" | "multiply" =>
          {
            println("Multiply Numbers")
            a * b
          }
          case _ =>
          {
            println("Operation Not matched")
            return 0
          }
        }
  
  var a = 100
  var b = 100
  
    
  // Case with multiple expressions
   def testcaseconditional(x:Int) = x match 
   { 
   
       // if value of x is 0, 
       // this case will be executed 
       case 0  => {if (a == b) {println(a)}}
         
       // if value of x is 1,  
       // this case will be executed 
       case irfan if (x > 0 & x < 10) => {if (a != b) {println(b)}}
       
       case magesh if x > 10 & x < 100 => {if (a != b) {println(b+a)}}
       
       // if x doesnt match any sequence, 
       // then this case will be executed 
       case _ => "Good Luck!!"
   }

// case statement will check/compile for all cases and executes the first best case, 
// hence execution time for case pattern matching is higher than the if conditional structure.
  val xxx="scala"
  xxx match{
      case "scala" => println("hello")
      case "scala" => println("hi")
      case _ => println("else case")
      }

// if condition will check for the first best case and come out of the execution
val xxxx="scala"
  
  if (xxxx=="scala") println("hello")
  else if (xxxx=="scala") println("hello")
  else println("else case")
  
  
  val xx="scala"
  xx match{
      case "python" => println("hello")
      case "scala" => println("hi")
      case _ => println("else case")
      }

// use label to unconditionally check for all cases or patterns and which ever matches execute it.
    val xxy="scala"
  xxy match{
      case irfan if(xxy=="python") => println("hello")
      case prakash if(xxy=="scala") => println("hi")
      case _ => println("else case")
      }
  
    if(true){
      if(xxy=="python") println("hello")
    }
    else if(true){
      if(xxy=="scala") println("hello")
    }
    else
      println("else case")
    
// Achieve the same above case functionality using the if conditional structure also.  
  val x=0;
  if (x == 0) //directcondition
  {
    if (a == b) 
    {println(a)}
  }
  else if (true & x > 0 & x < 10) //multiplecondition
  {
    if (a != b) 
    {println(b)}
  }
  else if (true & x > 10 & x < 100)  //notmatching
  {
    if (a != b) 
    {println(b+a)}
  }
  else
    "Good Luck!!"
    
   }







