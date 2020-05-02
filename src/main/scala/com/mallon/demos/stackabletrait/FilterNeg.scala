package com.mallon.demos.stackabletrait

trait FilterNeg extends IntQueue {
  abstract override def put(x: Int): Unit = if(x > -1) super.put(x)
}
