package Week4wed

fun main() {

    println("--- Requirement 1: describeToday ---")
    describeToday()

    println("--- Requirement 2: favouriteThing ---")
    println(favouriteThing())

    println("--- Requirement 3: pickOne ---")
    println(pickOne(3))

    println("--- Requirement 4: pickOneShort ---")
    println(pickOneShort(3))

    println("--- Requirement 5: pickWithDefault ---")
    println(pickWithDefault())
    println(pickWithDefault(name = "Sam"))
}


fun describeToday() {
    println("I will choose what I will eat today.")
}


fun favouriteThing(): String {
    return "My favourite food is Steak"
}


fun pickOne(number: Int): String {
    return when (number) {
        1 -> "Lamb"
        2 -> "Chicken"
        3 -> "Swordfish"
        4 -> "Potatoes"
        5 -> "Couscous"
        else -> "Leftovers"
    }
}


fun pickOneShort(number: Int): String = when (number) {
    1 -> "Lamb"
    2 -> "Chicken"
    3 -> "Swordfish"
    4 -> "Potatoes"
    5 -> "Couscous"
    else -> "Leftovers"
}


fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val food = when (number) {
        1 -> "Lamb"
        2 -> "Chicken"
        3 -> "Swordfish"
        4 -> "Potatoes"
        5 -> "Couscous"
        else -> "Leftovers"
    }

    return "$name: $food"
}