val list = List(1, 2, 3)
val list0 = 0 +: list
val list4 = list0 :+ 4
val listx = list0 ::: list4

val b = (1 to 5).toList
val c = (1 to 10 by 2).toList
val d = (1 until 5).toList
val e = List.range(1, 5)
val f = List.range(1, 10, 3)