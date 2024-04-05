class Person(var firstName: String, var lastName: String) {
    println(firstName)
    val age = 0
    override def toString = s"$firstName"
    print("end of construction")
}
val roof = new Person("Twin", "Panichsombat")
roof.toString()
println(roof.firstName)
println(roof.lastName)
// roof.firstName = "James"
// println(roof.firstName)
// println(roof.lastName)
