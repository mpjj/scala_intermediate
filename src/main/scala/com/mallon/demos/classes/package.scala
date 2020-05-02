package com.mallon.demos.classes

package object myPackage {
  val packageGlobalVal = 100
  def packageGlobalDef = "Hello there"
}

object PackageObject extends App{
  val myVal = myPackage.packageGlobalVal
  println(myPackage.packageGlobalVal)
}