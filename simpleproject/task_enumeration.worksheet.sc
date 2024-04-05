object States extends Enumeration {
    type State = Value
    var Todo, Doing, Done = Value
}

case class Task (id: Int, title: String, var state: States.State) {
    import States._
    def next() = { 
        if (state == Todo) copy(state = Doing)
        else if (state == Doing) copy(state = Done)
        else this
    }
}

val buyBanana = Task(id = 0, title = "Buy Banana", state = States.Todo)
buyBanana
val buyingBanana = buyBanana.next()
buyingBanana
val doneBuyBanana = buyingBanana.next()
doneBuyBanana