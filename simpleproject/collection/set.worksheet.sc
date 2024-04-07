val set = scala.collection.mutable.Set[Int]()
set += 1
set += 2 += 3
set ++= Vector(4, 5)
set += 2 // Ignore adding the existing element (silent)
set.add(6)
set
set -= 1