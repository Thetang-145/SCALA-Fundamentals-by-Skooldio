class ScalaClass(value: String) {
    def oneParameter(x: String) = x
    def >>(some: String) = s">> $some"
    def ->:(none: String) = s"-> $none"
}
val sc = new ScalaClass("Something")
sc.oneParameter("skooldio")
sc oneParameter "skooldio"
sc.>>("skooldio")
sc >> "skooldio"
sc.->:("skoodio")
"skoodio" ->: sc

// Singleton object
object Logger {
    def printSomething(message: String) = println(s"Message $message")
}

class Project(name: String, dateToFinish: Int) {}

class Test {
    import  Logger._
    val project1 = new Project("a", 5)
    val project2 = new Project("b", 3)
    printSomething("2 projects created")
}

val test = new Test

// Companion opject & Multiple constructor
class Person {
    var name: String = ""
    var age: Int = 0
    def accessPrivateInformation() = println(Person.PrivateFilename)
}
object Person {
    def apply(name: String, age: Int) = {
        var p = new Person
        p.name = name
        p.age = age
        p
    }
    def apply(name: String) = {
        var p = new Person
        p.name = name
        p
    }
    private val PrivateFilename = "/usr/save/private"
}
val person = new Person
person.accessPrivateInformation()

val p1 = Person("roof", 42)
p1.name
p1.age
val p2 = Person("roof")
val p3 = Person("roof")
p2.toString()
p3.toString()
p2 == p3
p2.name
p2.age