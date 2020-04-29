package com.mallon.labs.functions

import scala.annotation.tailrec

object CurriedWhile extends App{
  @tailrec
  def curriedWhile (cond: => Boolean) (body: => Unit) {
    if(cond) {
      body
      curriedWhile(cond)(body)
    }
  }

  var count= 1
  curriedWhile(count < 11){
    println("Value of count is: " +  count)
    count = count + 1
  }

  //can't do it as a function because there is no Function Trait
  //that supports curried functions
//  val funcWhile = (cond: => Boolean)(body: => Unit) => {
//    if(cond) {
//      body
//      curriedWhile(cond)(body)
//    }
//  }
}
