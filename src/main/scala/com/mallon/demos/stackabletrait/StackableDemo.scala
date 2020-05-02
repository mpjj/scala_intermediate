package com.mallon.demos.stackabletrait

object StackableDemo extends App{
  //val queue = new BasicIntQueue with FilterNeg with Incrementing
  val queue = new BasicIntQueue with Incrementing with FilterNeg
  queue.put(10)
  queue.put(-1)
  queue.put(15)
  queue.foreach(println(_))
}
