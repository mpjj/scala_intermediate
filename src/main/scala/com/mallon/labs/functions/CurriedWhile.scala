package com.mallon.labs.functions

import scala.annotation.tailrec

object CurriedWhile extends App{
  //only methods can have multiple parameter lists - ie be curried
  //you can define a function with val here - there is not Function trait with multiple param lists
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
  //now do a do while as an extension exercise

}
