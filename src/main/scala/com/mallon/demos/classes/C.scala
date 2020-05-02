package com.mallon.demos.classes

package myPackage{
  class AA

  package mySubPackage{
    class AB1
    class AB2
  }
}

class C

object demo extends App{
  val a = new myPackage.AA
  val b = new myPackage.mySubPackage.AB1
  val c = new C
}
