package de.yatta.assemble


class PersonCompileError(age: Int, name: String) {
  fun sayHello() {
////	  CompiletimeError
//    println("Hi, I am $name, and I am $age years old")
  }
}


class PersonExplicit(age: Int, name: String) {
  var age = age
  var name = name

  fun sayHello() {
    println("Hi, I am $name, and I am $age years old")
  }
}


class PersonImplicit(private var age: Int, var name: String) {

  fun sayHello() {
    println("Hi, I am $name, and I am $age years old")
  }
}

fun main(args: Array<String>) {
  
  var p = PersonImplicit(27, "Implicit")
  println("I can access ${p.name} from here")
  p.sayHello()
 
  var p2 = PersonExplicit(44, "Explicit")
  p2.sayHello()
   
}