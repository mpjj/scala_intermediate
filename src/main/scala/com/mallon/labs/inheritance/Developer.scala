package com.mallon.labs.inheritance

import com.mallon.labs.classes.Employee

case class Developer(var language: String, i: Int, n: String, a: Int)
  extends Employee(i,n,a) with Musical with Artistic {
}
