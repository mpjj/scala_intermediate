package com.mallon.demos.classes

class Person (val first: String,
              val last: String,
              age: Int = 21)

object Person{
  def apply(first: String, last: String) = new Person(first, last)
}
