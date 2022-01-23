package org.inceptez.scalaprograms
// _, [],{}, ., <-, =>, +=
object ScalaControlLoop3 {
    def main(args:Array[String]):Unit =
  {
    /* Control Statements
    * */	
     // For Loop -- Entry controlled loop 
    //print numbers from 1 to 10
    val n=10;
    for(i <- 1 to 10 by 1)
    {
      println("For Loop : " + i)
    }
    
    //Decrement from 10 to 1
    for(i <- 10 to 1 by -1)
    {
      println("Negative For Loop : " + i)
    }
    
    //using until which will not include the final number
    for(i <- 1 until n)
    {
          println("For loop until : " + i)
    }
    
    //using while loop  -- Entry controlled loop
    var i = 0;
    while (i <= 10)
    {
      println("while loop : " + i)
      i = i + 1 // i+=1
    }
    
    //using do while loop -- Exit controlled loop
     
    var j = 20;
    do
    {
       
      println("Do while : " + j)
     j = j + 1
    
    }
        while(j <= 10)
    
    // multi level looping      
    for(i <- 1 to 10; j <- 1 to 3)
    {
      println("i value:" + i + " j value:" + j)
    }
        
    for(i <- 1 to 10)
    {
      for (j <- 1 to 3)
      {
       println("i value:" + i + " j value:" + j)
      }
    }
    

    for(i <- 1 to 10)
    {
      if(i%2==0)
      {
        println("even number is "+i)
      }
      else
        println("odd number is "+i)
    }
    
}
}
