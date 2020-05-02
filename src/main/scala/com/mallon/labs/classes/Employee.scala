package com.mallon.labs.classes

class Employee(val id: Int, n: String, a: Int) {
  private var _name = n
  private var _age = a

  def name: String = _name
  def age: Int = _age

  def name_=(name: String):Unit = if(!"".equals(name)) _name = name
  def age_=(age: Int):Unit = if (!(age < 0) && age < 65) _age = age
}

object Employee{
  def apply(id: Int, name: String, age: Int)= new Employee(id, name, age)
}
