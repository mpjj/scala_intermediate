class MyClass{
  //val now = new java.util.Date().toString
  //def now = new java.util.Date().toString
  lazy val now = new java.util.Date().toString
}

val t1 = new MyClass
new java.util.Date().toString
Thread.sleep(2000)
t1.now
Thread.sleep(1000)
t1.now
Thread.sleep(1000)
t1.now