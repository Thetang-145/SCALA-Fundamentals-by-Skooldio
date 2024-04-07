val abuffer = scala.collection.mutable.ArrayBuffer[Int]()
val nums = scala.collection.mutable.ArrayBuffer(1, 2, 3)
nums += 4
nums += 5 += 6
nums ++= List(7, 8, 9)
nums -= 9
nums -= 8 -= 7
nums --= Array(6, 5)
nums --= Array(6, 5)

val a = scala.collection.mutable.ArrayBuffer(1, 2, 3)
a.append(4)
print(a)
a.append(5, 6)
print(a)
a.appendAll(Seq(7, 8))
print(a)
a.clear
print(a)

val b =scala.collection.mutable.ArrayBuffer(9, 10)
b.insert(0, 8)
print(b)
b.insertAll(0, Vector(4, 5, 6, 7))
print(b)
b.prepend(3)
print(b)
b.prepend(1, 2)
print(b)

val c =scala.collection.mutable.ArrayBuffer.range('a', 'h')
print(c)
c.remove(0)
print(c)
c.remove(2, 3)
print(c)

val d =scala.collection.mutable.ArrayBuffer.range('a', 'h')
print(d)
d.trimStart(2)
print(d)
d.trimEnd(1)
print(d)
