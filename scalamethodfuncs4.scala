package org.inceptez.scalaprograms

object scalamethodfuncs4 { //object is an executable class
def main(args:Array[String]):Unit =
{
  
/* Methods in Scala
     Syntax:
         def functionName(parameters : typeofparameters) : returntypeoffunction = 
         {  
    statements to be executed  
     }  
 * */

  /*
 * method declaration & definition have 6 components:

def keyword: “def” keyword is used to declare a method in Scala.

method_name: It should be valid name in lower camel case and the name can have
characters like +, ~, &, –, ++, \, / etc.

parameter_list: In Scala, comma-separated list of the input parameters are defined,
preceded with their data type, within the enclosed parenthesis.

return_type: User must mention return type of parameters while defining function and
return type of a function is optional. If you don’t specify any return type of a function,
default return type is Unit which is equivalent to void in Java.

In Scala, a user can create function with or without = (equal) operator. If the user uses
it, the function will return the desired value. If he doesn’t use it, the function will not
return any value and will work like a subroutine.

Method body: Method body is enclosed between braces { }. The code you need to be
executed to perform your intended operations.
 */
// Methods, accept/returns arguments or not (Unit), overloading , currying , default params
// Functions -> Anonymous, lambda, literals, value functions - quick functionalities 
// without considering reuability accross , cant have return keyword

println("Calling the method wage1 with no return type using positional arguments eg: Insert into table ");

wage1(10000,.03);


println("Calling the method wage1 with no return type using named arguments eg: Insert into table " );
wage1(bonus=.03,salary=10000);


println("""Calling the method wage2 with return keyword to receive the output of the method 
         eg: select from table applying concat function""" );
wage2(10000,.03);
println("""Calling the method wage3 with last expression returned without using the return keyword
    eg: select from table applying concat function """);
wage3(10000,.03)
println("""Calling the method wage4 with unknown input type for bonus and unknown return type,
           as the input for bonus can be any and 
           the output is also any type we are using any type here eg: Bonus is percentage to be MULIPLIED """);
wage4(10000,.03)
println("""Calling the method wage4 with unknown input type for bonus and unknown return type, 
           as the input for bonus can be any and the output is also any type we are using any type here 
           eg: Bonus is whole value to be ADDED""");
wage4(10000,300);

println("Calling the method wage5 curly braces is optional if there is not more than 1 expression or line of code" );
wage5(10000,.03)

println("What is method Overloading - A method with same name but different in number of input parameters or type of input parameters")
println("""Calling the method wage6 Overloading with INT type with 1 argument 
eg: Same function name with different input type""");
wage6(10000)
println("""Calling the method wage6 Overloading with DOUBLE type with 1 argument 
eg: Same function name with different input type""" );
wage6(10000.20)
println("""Calling the method wage6 Overloading with 2 arguments 
eg: Same function name with different number of arguments""");
wage6(10000,.03)
println("""Calling the method wage7 with Default Arguments 
eg: if we dont know bonus value, default can be taken, otherwise the passed value will be considered""");
wage7(10000)
println("Calling the method wage8 with no return as no = is used" );
wage8(10000,.03)
println("Calling the method wage8 with no input arguments" );
wage8(10000,.03)


println("""Calling the method wage9 to understand currying/partial functions, 
as we dont know the bonus percent currently, we are partial""");
//wage9(10000)(.02);
val bonus1=.02
val partfunc=wage9(bonus1)_;
println("""Calling the method wage9 to understand currying/partial functions, 
once we get the bonus percentage we are getting final result""");
// We are getting the salary from the DB
println(partfunc(10000));

println("Anonymous function or Value function or Lambda function or Function literal");
println(wage10(10000,.03));
println(wage10(10000,.03));
println(wage10(10000,.03));

// Not a good way to write the same logic again and again, rather create an anonymous function and call n number of times with in ur program.
val salary=10000;
val bonus=.03;
val x=salary-(salary*bonus);
val bonus2=.04;
val y=salary-(salary*bonus2);
val bonus3=.05;
val z=salary-(salary*bonus3);

println(wage11(10000,1000));
println(wage12(10000,1000));





// Closure is a function, where the result of the function can be varied based on one or more values defined outside
println("Calling the method wage13 to understand closure");
println(wage13(10000))
println(wage13(10000))
// Higher Order Function is a function/method where we can pass another function as an argument.
println("Calling the method wage14 to understand Higherorder method");
println(wage14(10000,bonusfunc(10000)));
}


// no return values

def wage1(salary:Int,bonus:Double):Unit =  
{
println("wage1 with No return value")
val finalsal = salary+(salary*bonus);
println(finalsal);
}

// return a value or an expression
def wage2 (salary:Int,bonus:Double):Double = 
{
println("wage2 Return an expression")
val modifier=bonus+0;
val returnsal=salary+(salary*modifier)
println(returnsal)
return returnsal // better to use
//return {salary+(salary*modifier)} // again repeating the same logic which can be avoided
}

//return keyword optional, if you use return it will have better control
def wage3(salary:Int,bonus:Double):Double = 
{
println("wage3 Return keyword in optional")
val finalsal = salary+(salary*bonus);
val incend1=100
val incend2=200
//finalsal
finalsal+incend1
println(finalsal)
//return finalsal+incend1  // this will be returned taking the priority and ignore rest of lines of code
println(finalsal);
finalsal+incend2 // last expression will be returned, ignoring all in between expressions. If we use return statement, first return statement will be executed 
                //  using return explicitly, we can control when we wanted to return a result.
//println(finalsal);
}

//return/input datatype is unknown
def wage4(salary:Int,bonus:AnyVal):AnyVal=  
{
println("wage4 Input or Return datatype can be unknown")
if (bonus.isInstanceOf[Double])
{
println("bonus is double type")
val finalsal = salary+(salary*bonus.asInstanceOf[Double]);
finalsal
}
else
{
println("bonus is not double type")
val finalsal = salary+bonus.asInstanceOf[Int];
finalsal
}
}

//for single statement curly braces are optional
def wage5(salary:Int,bonus:Double) = salary+(salary*bonus)


// Function/method Overloading
// 

def addsqrt(a:Int):Int={a*a}
//def addsqrt(b:Int):Double={b.toDouble}
def addsqrt(a:Double):Double={a/2}
def addsqrt(a:Int,b:Int):Int={a+b}
// def addsqrt(a:Int,b:Int):Boolean={true} // same name with diff return type is also overloading? No

def wage6 (salary:Int):Int = 
{
println("wage6 Function Type overloading with int type")
return (salary + 1000)
}

def wage6(salary:Double):Int = 
{
println("wage6 Function Type overloading with double type")
return salary.toInt + 1000;
} 

def wage6(salary:Int,bonus:Double):Double = 
{
println("wage6 Function overloading with 2 args")
val finalsal = salary+(salary*bonus);
finalsal
} 

def wage6(salary:Int,bonus:Int):Int = 
{
println("wage6 Function overloading with 2 args")
val finalsal = salary+bonus;
finalsal
} 

//Parameter example with default value (Overriding) but not overloading

def wage7(salary:Int,bonus:Double=.02):Double = 
{
println("wage7 Example for Default Arguments")
val finalsal = salary+(salary*bonus);
finalsal
}

// Method with no = will behave like a subroutine or procedure with no return type

def wage8(salary:Int,bonus:Double)
{
  println("wage8_proc output is " + (salary+(salary*bonus)))
}

// Method with no input argument
def wage8:Int = 
{
println("wage8 with no arguments, hence paying default salary with bonus")
5500
}

// Method with no input arguments and no output type subroutine or procedure
def wage81 
{
println("wage81 with no arguments, and no output argument - Execute something by default and dont return anything - Method to cleanup (GC) and its going to log")
println("Default Salary is "+5500);
}

// Min syntax we can create a method 
def someName {}

def met1:String={println("clean up my memory GC"); return "100 mb cleaned"}
def met2={println("clean up my memory GC"); println("100mb cleaned")}

// Method with more than 1 output type
def wage82:(String,Int,Int) = 
{
println("wage82 with no input arguments, hence paying default salary with bonus with incentive")
("IT",200,100)
}

def wage83:Array[Int] = 
{
println("wage82 with no input arguments, hence paying default salary with bonus with incentive")
return Array(5000,200,100)
}

//currying or partial functions
def wage9(bonus:Double)(salary:Int):Double =  
{
// bonus calculation is taking 5 secs to complete -> create partial function once using the 5 seconds time, rather than executing the whole method taking 5 secs each and every time
// apply bonus to the salary is taking 10 seconds 
println("Currying method with multiple input and output arguments")
val finalsal = salary+(salary*bonus);
finalsal
} 

val custarr=Array(1000, 2000, 3000)
def gstcalc(prod:String)(amt:Int)=
     {
      var gst=0.0
      if (prod=="food" )
      gst=.13 
      else 
      gst=.05
      val finalamt=amt.toInt+(amt*gst).toDouble
      println("gst applied amount is" + finalamt) 
      }

val func1=gstcalc("food")_
custarr.map(x=>func1(x))

//Function is a object which can be stored in a variable is called anonymous functions, used for some quick 
// implementation of logics inside a program multiple times
// Anonymous function or Lambda function or Function literal or value function

val wage10 = (salary:Int,bonus:Double) => 
{
println("wage10 function call, can't have return, only last expression returns")
//salary-(salary*bonus);
salary+(salary*bonus);
}

//Also we can define the same function in the short form assigned to a variable called as anonymous functions
var wage11 = (salary:Float,penality:Float) => { salary-penality }

//Also we can define the same function in the short form (Lambda function)
var wage12 = (_:Float) - (_:Float)

// Closure - if the output of a method depends based on the value defined outside of the method.

//val obj1=new org.inceptez.allmethods.ReusableMethods;

var bonus=.03;
def wage13(salary:Int):Double=
{
  salary+(salary*bonus);
}

//Higher Order Method - If a method accepts another method as an argument
val bonusfunc=(salary:Int)=>salary*0.03;

def bonusmet(salary:Int):Double=salary*0.03;

def wage14(salary:Int,bonus:Double):Double=
{
  salary+bonus
}

//wage14(10000,bonusfuncmet(10000));

}
