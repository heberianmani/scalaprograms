package org.inceptez.scalaprograms

object ScalaControlCondition2 {
	def main(args:Array[String]):Unit =
		{
			/* if statement consists of Boolean expression and/or logical/bitwise expressions followed by one or more statements.
    Syntax:
    if(boolean_expression) 
    {
				statements
			}
			 * */	
	  
			var studmarks = 75

					if ( studmarks > 65) 
					{
						println("Student passed the exam with distinction")
					}

			//Else
			var marks1 = 80
					if( marks1 > 65) 
					{
						println("Student passed the exam with distinction")

					} 
					else 
					{
						println("Student mark is less than 65")
					}

			//Nested If (3rd image in the pdf)
			
			val x=15
					if (x>20)
					{ 
						if(x<30)
					  {println("in the second if block")}
					  else
					  {println("in the second else block")}  
					} 
					else
					{
						if(x<15)
					  {println("in the third if block")}
					  else
					  {println("in the third else block")}
					}			
			
			
			
			//Scenario Else If
			println("Student grading system")
			println("Enter the std of the student")
			val std =scala.io.StdIn.readInt(); //10
			println("Enter the attendance of the student")
			val attendance=scala.io.StdIn.readLine(); //p
			println("Enter the mark of the student")
			var marks = scala.io.StdIn.readInt(); // 0 to 100
					//mark 70 and 40 - c, mark 71 and 79 - b, mark 71 and 79 - b

def grading(marks:Byte,attendance:String,std:Byte):Unit={			
			if (marks != 0 && attendance == "p" && std==10)
			{  
				if ( marks >= 40 & marks < 70)
				{
					println("Grade is C")
				}
				else if(marks >= 70 & marks < 80) 
				{
					println("Grade is B")
				} 
				else if(marks >= 80 & marks < 90) 
				{
					println("Grade is A")
				} 
				else if(marks >= 90) 
				{
					println("Grade is A+")
				} 
				else //if (marks < 40)
				{
					println("Student is not performing well hence no grade is awarded")
				}
			}			
			else
			{
			  if(marks == 0)
			  {
			    println("Mark is 0, cannot award this student ")
			  }
			  else if (attendance != "p")
				  println("Student didnt attended exam ");
			  else
			    println("The student std is not 10th");
			}
}	
			
			
			if (marks == 0 || attendance != "p" || std!=10)
				println("Either Student didnt attended exam or he scored 0 or he is not belonging to 10th std");
			else 
			{  
				if ( attendance == "p" && std==10 && marks>0) 
				{
					if ( marks < 70 & marks > 40)
					{
						println("Grade is C")
					}
					else if(marks >= 70 & marks < 80) 
					{
						println("Grade is B")
					} 
					else if(marks >= 80 & marks < 90) 
					{
						println("Grade is A")
					} 
					else if(marks >= 90) 
					{
						println("Grade is A+")
					} 
					else 
					{
						println("Student is not performing well hence no grade is awarded ")
					}
			  
				}
			}

			
			


			
}
}