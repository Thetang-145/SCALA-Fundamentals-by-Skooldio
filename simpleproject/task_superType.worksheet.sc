trait Task {
    val id: Int
    def next(): Task
}

case class Todo (id: Int, title: String) extends Task {
    def next(): Doing = Doing(id, title)
}
case class Doing (id: Int, title: String) extends Task {
    def next(): Done = Done(id, title)
} 
case class Done (id: Int, title: String) extends Task {
    def next(): Done = this
}

val buyBanana = Todo(1, "buy banana")

var buyingBanana = buyBanana.next()
buyingBanana

// var doing: List[Doing] = List[Doing]()
// doing = buyBanana +: doing
