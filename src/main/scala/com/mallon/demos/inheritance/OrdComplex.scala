package com.mallon.demos.inheritance

import com.mallon.demos.classes.Complex

class OrdComplex(r: Int = 0, i: Int = 0) extends Complex(r, i) with Ordered[OrdComplex] {
  override def compareTo(that: OrdComplex): Int = this.re - that.re
}

object OrderedDemo extends App{

  val oc1 = new OrdComplex(2,3)
  val oc2 = new OrdComplex(3,4)

  println(oc1 < oc2)
}
