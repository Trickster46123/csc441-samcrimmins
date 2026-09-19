package Week4Fri

fun main() {

    println("--- Requirement 1: Two names ---")
    val firstName: String = "Sam"
    val middleName: String? = null

    println(firstName.length)

    println("--- Requirement 2: Safe call ---")
    println(middleName?.length)

    println("--- Requirement 3: Elvis operator ---")
    println(middleName?.length ?: 0)

    println("--- Requirement 4: let block ---")

    middleName?.let {
        println("Middle name: $it")
    }

    val nickname: String? = "Sam"

    nickname?.let {
        println("Nickname: $it")
    }

    println("--- Requirement 5: toIntOrNull ---")
    val notANumber = "banana".toIntOrNull()
    println(notANumber ?: "That wasn't a number")

    println("--- Requirement 6: listOf ---")
    val swimEquipment = listOf("Goggles", "Swim Cap", "Jammer", "Towel")
    println(swimEquipment)

    println("--- Requirement 7: mutableListOf ---")
    val tasks = mutableListOf("Workout", "Walk The Dog", "Homework")

    tasks.add("Groceries")
    tasks.remove("Homework")

    println(tasks)
    println("Items: ${tasks.size}")

    println("--- Requirement 8: List of numbers ---")
    val scores = listOf(90, 75, 85, 60, 95)

    println(scores.sum())
    println(scores.average())
    println(scores.filter { it % 2 >= 1 })

}