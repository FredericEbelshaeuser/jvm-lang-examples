

package de.yatta.assemble.scala

class Interpreter {
  
  //Type Inference
  var i:Int=1
  i=1
//  i= "hello"
  i=2
  
  //Immutability
  val j=1
//  j=2
  
  //Syntactic Sugar
  (1 to 10)
  (1.to(10))
  (1 to 100).foldLeft(0)(_ + _)
  (1 to 100).foldLeft(0)((sum, v) => sum + v)
  
}