val items = Map(
    "CPU" -> "100",
    "Ram" -> "200",
    "Monitor" -> "300"
)
items.keys
items.values

val states = collection.mutable.Map("AK" -> "Alaska")
states += ("AL" -> "Alabama")
states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
states ++= Map("CA" -> "California", "CO" -> "Colorado")
print(states)
states -= "AR"
print(states)
states -= ("AL", "AZ")
print(states)
states("AK") = "Alaska, A Really Big State"
print(states)

val ratings = Map(
    "Lady in the Water" -> 3.0,
    "Snakes on a Plane" -> 4.0,
    "You, Me and Dupree" -> 3.5
)

for (rating <- ratings) println(rating._1 + "-" + rating._2) // not the common use
for ((k, v) <- ratings) println(s"$k, $v")