class Task {
    var id: Int = 0
    var title: String = ""
    var state: Int = 0
    def next() = { if (state == 2) 2 else state += 1}
}

object Task {
    def apply (id: Int, title: String, state: Int) = {
        var t = new Task
        t.id = id
        t.title = title
        t.state = state
        t
    }
    def apply(id: Int, title: String) = {
        var t = new Task
        t.id = id
        t.title = title
        t       
    }
}

val buyBanana = Task(id = 0, title = "Buy Banana")
buyBanana.state
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state
