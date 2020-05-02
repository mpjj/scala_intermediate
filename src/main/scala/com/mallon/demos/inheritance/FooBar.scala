package com.mallon.demos.inheritance

trait Foo {
  def bar = "foo"
}

trait Bar{
  def bar = "bar"
}

class FooBar extends Foo with Bar{
  //ambiguity if you don't override bar at all
  //linearization removes ambiguity from call to super
  override def bar: String = super.bar
  //can override the linearization with explicit syntax
  //override def bar: String = super[Foo].bar
}

class BarFoo extends Bar with Foo{
  override def bar: String = super.bar
}

object Demo extends App{
  val fooBar = new FooBar()
  val barFoo = new BarFoo()
  println(s"FooBar says: ${fooBar.bar}")
  println(s"BarFoo says: ${barFoo.bar}")
}