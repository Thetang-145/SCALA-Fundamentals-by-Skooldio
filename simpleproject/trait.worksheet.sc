trait TaskTrait {
    val id: Int
    def next (): TaskTrait
    def pervious (): TaskTrait
}

object States extends Enumeration {
    type State = Value
    var Todo, Doing, Done = Value
}

case class Task (id: Int, title: String, var state: States.State) extends TaskTrait {
    import States._
    def next() = { 
        state match
            case Todo => state = Doing
            case Doing => state = Done
            case _ => state = Done
    }
    def pervious() = { 
        state match
            case Done => state = Doing
            case Doing => state = Todo
            case _ => state = Todo
    }
        
}