case class Person(name: String, age: Int) {}

val p1 = Person("roof", 47)
val p2 = Person("roof", 47)
val p3 = Person("roof", 43)
p1 == p2
p1 == p3
p1.toString()