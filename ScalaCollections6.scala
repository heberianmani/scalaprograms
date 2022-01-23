package org.inceptez.scalaprograms

import scala.collection.mutable.ArrayBuffer
//import scala.collection.mutable._
import Array._

object ScalaCollections6 {

  /*
   * Scala has rich set of collection library
   * Collection are the containers that holds elements 		
	   
   * 1. Seq - Collection of element may be indexed or linear/linked list
   * Array/List  - Mutable/Immutable (non resizable).
   * ArrayBuffer/ListBuffer - mutable, resizable
   * 
   * 2. Map - contains a collection of key value pairs
   * 3. Set - collection that contains no duplicate values
  	
   */
  def main(args:Array[String]):Unit =
  {
    /*
     * Seq -
     * 			- mutable Array
     * 			- immutable List
     *      
     * */
            
       
       // Also we can define as
       var s2 = Seq(10,20,30,40,50)
       //Due to immutable, update is not possible
       //s2(4) =40 
       println("This shows Seq is mutable/immutable based on the package we choose " + s2(4))
       
       // ARRAY
       //An array is sequential and is of a fixed size.
       //Array - Array in scala is sequential, fixed in size and mutable 
       
      
       //Declare Array with 1 element with type of Float/Int
       
       val ar = Array[Float](5);
       println("result of Array[Int](5) is : " + ar(0))
       
       val arr0=Array(1,2,3)
       val arr1=Array(1.1,2,3)
       val arr2=Array[Long](1,2,3)
       val arr3:Array[Long]=Array(1,2,3)
       val arr4:Array[Long]=Array[Long](1,2,3)

       //or
       
       val ar1 = Array(1,2,3,4,5)
       
       println("Fourth element of Array(1,2,3,4,5) is : " + ar1(3))
       
       //Creating array with range
       
       val ar2= scala.collection.Seq.range(2,15,2)
       println("Second element of range(2,15,2) is : " + ar2(1))
       val ar3 = range(15,2,-2)
       println("Second element of range(15,2,-2) " + ar3(1))
       println(ar2(1));

        //Mutability Property of an Array
        ar1(2)=10;
        ar1(3)=100;
        //Non Resizable Property of an Array (below is not possible)
        //ar1+=20;
        //ar1.add(20);
       
        // Functions of Array       
       println(ar1.length)
        
       ar1.sorted.take(3).foreach(println)
        ar1.contains(1)
        println(ar1.length)
        println(ar1.isEmpty)
        ar1.sorted
 
      val ar222=Array[Int]();
        if (ar222.isEmpty)
        {
          println("Array is empty");
        }

  
  /*
   * A list in Scala Collections is much like a Scala array. 
   * Except that, List is immutable and represents a linked list. 
   * An Array, on the other hand, is flat and mutable.
  */
  
       val lst = List(10,20,30,40)
       
       val fruits = List("apples", "oranges", "mangoes")
      
      val g = fruits(0)
      
      var list = List(1,8,5,6,9,58,23,15)
      //var list11 = List(List(1,"a",100000),List(2,"b",200000))
      
      //Access value from the list
      list(2)
      
      val lstval = list(0)

      //Mutability Property of a List
      //Update the element in the list
      //list(2)=100

      //Non Resizable Property of an List (below is not possible)
      //list+=20;
      //list.add(20);
      
      // Functions on List
      //Merging 2 list
      var list3 = list ++ lst 
      //or
      var list4 = list ::: lst 
            
      println(list3)
      println(list4)

      println(list.contains(2))
      
      println(list4.head)
      list4.tail.foreach(println)
      println(list4.length)
      println(list4.isEmpty)
      list4.sorted.foreach(println)
      list4.reverse.foreach(println)

      //Array buffer - mutablity, resizability features
      var arb1=scala.collection.mutable.ArrayBuffer(10, 2, 3, 5, 6, 6,6)
      arb1(0)=100
      arb1-=6
      arb1+=6
      
      
/*
   Tuples are immutable, contains fixed length of different type elements
  */
      
      val emp = (101,"Karthik",200.00)
      val empid = emp._1
      val empname = emp._2
      val empsal = emp._3
      
      val emp1 = (101,"Karthik",200.00,("New Street","Chennai","TN",60002),Array(10,20,5,3))
      
      val empcity = emp1._4._2
      
      
      
       
        /*
   * A Map in Scala is a collection of key-value pairs, and is also called a hash table. 
   * We can use a key to access a value. 
   * Keys are unique and values may be in common
   * Map is by default immutable   	 
   * */
       
       //Create an empty map
      var m2 = Map.empty[String,String]
        
     
       //Immutable map, doesn't allow to modify but allows to add or remove internally by recreating
        //Add multiple Map elements      
      var immutablemap = scala.collection.immutable.Map(1 -> "Alto",2 -> "Swift")  
            
      immutablemap -= (2)
      immutablemap += (3->"Verna")
      //Below update is not possible
      //immutablemap(1)="Alto k10"
      
      var mutablemap = scala.collection.mutable.Map(1 -> "Alto",2 -> "Swift")
      //Below update is possible
      mutablemap(1)="Alto k10"
      mutablemap=mutablemap + (3->"Verna")
      mutablemap=mutablemap - 2
      // Functions on Map
      mutablemap.keys
      mutablemap.values
      mutablemap.isEmpty
      
      val lst1 = mutablemap.toList
      val arr = mutablemap.toArray

      
 /* A Scala Set is a collection that won’t take duplicates.
  * By default, Scala uses immutable sets.   	 
 * */
 
     
     var games = scala.collection.immutable.Set("Cricket","Football","Hockey","Golf","Cricket","Football") 
     println(games)

     println("Either mutable or immutable, I can Resize - add/remove (insert/delete) if its of type var");
     //val games = scala.collection.immutable.Set("Cricket","Football","Hockey","Golf","Cricket","Football")
     
     games += "Tennis"
     games -= "Cricket"
     
     
     println("Due to Immutable, I am able to modify/update, uncomment the below code and check")
     //games.update("Golf",true)
     
     val mutablegames = scala.collection.mutable.Set("Cricket","VollyBall","BaseBall","Hockey")
     println("Due to mutable, I am able to update and add then")
     mutablegames.update("Cricket",true)
     mutablegames.add("BaseBall")
     mutablegames.remove("Hockey")
     
     println("Either mutable or immutable, I can Resize - add/remove (insert/delete) if its of type var");
     mutablegames.add("Chess");
     mutablegames.add("Hockey");
     mutablegames.remove("Cricket");
     
     println(mutablegames)
     
     //Functions on Set
     println(games);
     println(games.head)             // Returns first element present in the set  
     println(games.tail)         // Returns all elements except first element.  
     println(games.isEmpty)          // Returns either true or false  
           
     println(games.max)
     println(games.min)
     println(games.contains("Tennis"))
     println(games ++ mutablegames);
     println(games.intersect(mutablegames))
     println(games.union(mutablegames))
     println("Set difference");
     println(games.diff(mutablegames))
 
  }
}
