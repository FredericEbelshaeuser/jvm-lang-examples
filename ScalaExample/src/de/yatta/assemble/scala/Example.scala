package de.yatta.assemble.scala

object Example extends App {
  println("Hello, world!")

  class Person(val name: String, val surname: String) {
    def fullName(prefix: String): String = {
      s"$prefix $name $surname"
    }
  }
  var p = new Person("Nakamuro", "Hiro");
  println(p.fullName("Mr."))

  //
  //
  //
  println("gaussify1(): " + gaussify1())

  def gaussify1(): Int = {

    var digits = (1 to 100)
    var sum = 0

    for (digit <- digits) { sum += digit }

    sum
  }

  //
  println("gaussify1x(): " + gaussify1x())

  def gaussify1x(): Int = {

    var sum = 0

    (1 to 100).foreach(sum += _)

    sum
  }

  //
  println("gaussify2(): " + gaussify2())

  def gaussify2(): Int = {

    (1 to 100).foldLeft(0)((sum, v) => sum + v)
  }

  //
  println("gaussify3(): " + gaussify3())

  def gaussify3(): Int = {

    (1 to 100).foldLeft(0)(_ + _)

  }

}