trait Animal {
    val name: String
}

case class Dog(name: String) extends Animal{}
case class Cat(name: String) extends Animal{}

val myDog = Dog("meme")
val myCat = Cat("momo")

object Caller {
    def say (animal: Animal) = {
        animal match
            case Dog(_) => println("Woof")
            case Cat(_) => println("Meaw")
            case _ => println("I don't know")
    }
}

Caller.say(myCat)
Caller.say(myDog)