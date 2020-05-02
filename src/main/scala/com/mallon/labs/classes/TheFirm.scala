package com.mallon.labs.classes

object TheFirm extends App {
  val emp1 = Employee(1, "Mike", 49)
  val emp2 = Employee(2, "Mark", 56)
  emp1.name = "Dave"
  emp2.age = 53
  emp1.name = ""
  emp2.age = -10

  print(
    s"""Employee  Age
       |${emp1.name}      ${emp1.age}
       |${emp2.name}      ${emp2.age}""".stripMargin)
}
