//first and last are not fields. Without var they are just constructor params.
//Visible throughout the class body so can be used to initialise other fields.
//Cannot be accessed from outside the class
class Person(first: String, last: String, val age: Int = 21){
  val name = s"$first $last"
}

val p = new Person("John", "Doe")
p.age
//p.first