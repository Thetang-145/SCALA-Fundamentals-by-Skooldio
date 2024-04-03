println("Hello world")
val value = "x"
var vari = 0
vari = -1
println(vari)

val result = if (vari == 0) "It is zero" 
else if (vari > 0) "Greater than zero"
else "Less then zero"

val list = List(1, 2, 4, 10)
for{item <- list} print(item)
list.foreach(item => println(item))
for{item <- list} yield item + 1
print(list)

def addOne(list: List[Int]) = {
    def recur(o: List[Int], n: List[Int]): List[Int] = {
        if (o.isEmpty) n
        else recur(o.tail, n :+ o.head +1)
    }
    recur(list, List())
}
print(list.tail)
print(list.head)
addOne(list)