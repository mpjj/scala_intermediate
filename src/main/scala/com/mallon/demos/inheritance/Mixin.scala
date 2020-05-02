package com.mallon.demos.inheritance

trait A {
  def name: String
}

trait B extends A {
  override def name: String ="class b"
}

trait C extends A {
  override def name: String ="class c"
}

class Mixin extends C with B {
  override def name: String = super.name
}
class Mixin2 extends B with C{
  override def name: String = super.name
}

object LinearizationDemo extends App{
    val mixin = new Mixin
    val mixin2 = new Mixin2

    println(s"Extending C with B gives name: ${mixin.name}")
    println(s"Extending B with C gives name: ${mixin2.name}")
}