val something = 1
something match
    case 1 => println("ONE")
    case 2 => println("TWO")
    case _ => println("ELSE")

case class Something(content: String) {}
val first = Something("first")
val second = Something("second")

first match
    case Something(content) if (content == "first") => println("FIRST")
    case Something(content) if (content == "second") => println("SECOND")
    case _ => println("ELSE")
