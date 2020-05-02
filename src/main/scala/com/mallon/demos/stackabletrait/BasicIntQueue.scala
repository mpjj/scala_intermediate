package com.mallon.demos.stackabletrait

import scala.collection.mutable.ArrayBuffer

class BasicIntQueue extends IntQueue with Traversable[Int] {
  private val buf = new ArrayBuffer[Int]
  override def get(): Int = buf.remove(0)
  override def put(x: Int):Unit = buf += x

  override def foreach[U](f: Int => U): Unit = buf.foreach(f: Int => U)
}
