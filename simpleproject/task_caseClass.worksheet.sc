case class Task (id: Int, title: String, var state: Int = 0) {
    def next() = { if (state == 2) 2 else state += 1}
}

val buyBanana = Task(id = 0, title = "Buy Banana")
buyBanana.state
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state
buyBanana.next()
buyBanana.state
