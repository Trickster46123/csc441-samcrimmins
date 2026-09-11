package Week3Fri

fun main() {

    for (i in 1..10) {
        print("$i ")
    }
    println()
 for (i in 20 downTo 1 step 3) {
     print("$i ")

 }
println()

val tripItems = mutableListOf(
    "Metal Water Bottle",
    "Backpack",
    "Solar Crank Radio",
    "Mobile Phone"
)

    for (item in tripItems) {
        println(item)
    }

    tripItems.forEachIndexed { index, item ->
        println("$index is $item")
    }

    for (i in 0 until tripItems.size) {
        println("$i: ${tripItems[i]}")
    }

    val dayNumber = 4

    val dayName = when (dayNumber) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println(dayName)

    val temperature = 75
    val weatherMessage = if (temperature > 70) "Warm day" else "Cool day"

    println(weatherMessage)
}