package com.mallon.demos.inheritance

trait Ordered[T] extends java.lang.Comparable[T] {

  def < (that: T):Boolean = compareTo(that) < 0
  def > (that: T): Boolean = compareTo(that) > 0

}
