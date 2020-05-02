package com.mallon.demos.classes

class Complex( val re: Int = 0, val im: Int = 0) {
  def + (that: Complex) = new Complex(this.re + that.re, this.im + that.im)

  def - (that: Complex) = new Complex(this.re - that.re, this.im - that.im)

  def unary_- = new Complex(-re, -im)

  override def toString = s"$re + $im i"
}


object Complex extends App{
  val cx1 = new Complex(2,4)
  val cx2 = new Complex(3, 5)
  val cx3 = new Complex (2, 3)
  val cx4 = cx1 + cx2
  //val cx4 = cx1.+(cx2)
  println(cx4)
  val cx5 = cx4 - cx3
  println(cx5)
  println(-cx5)
}