package com.mallon.labs.inheritance

import com.mallon.labs.classes.Employee

object TheFirm extends App{
  val dev1 = Developer("Java", 1, "Sally", 35)
  println(dev1.language)
  dev1.language = "C++"
  println(dev1.language)
  val emp1 = Employee(2, "Bob", 75)
  val dev2 = Developer("C++", 1, "Sally", 35)
  println(dev1 == dev2)
  println(dev1)
  dev2.sing()
  dev1.paint()
}
