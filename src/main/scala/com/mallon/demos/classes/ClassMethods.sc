class Person(first: String, last: String, val age: Int = 18){
  val name = s"$first $last"
  def isAdult(adultThreshold: Int): Boolean = age >= adultThreshold
  override def toString = s"$first $last ($age)"
}

val p = new Person("John", "Doe")

p.isAdult(18)

p.isAdult(21)

println("The person is " + p)