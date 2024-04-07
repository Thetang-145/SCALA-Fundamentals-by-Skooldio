val ints = (1 to 10).toList
ints.map(in => in + 1)
ints.map(_ + 1)

ints.filter(_ > 5)
ints.filter(_ > 5).reduce(_ + _)

var items = collection.mutable.Map(
  "a" -> 1,
  "b" -> 2,
  "c" -> 3,
  "d" -> 4
)
items.keys
items.values

items.values.sum
items.filterKeys(Set("b", "c")).toMap.values.sum