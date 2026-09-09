package Week3Wed

    fun main() {
        val firstName = "Sam"
        val major = "Computer Science"
        val favoriteFood = "Venison Rice Bowl"

        var cscCoursesTaken =  8
        cscCoursesTaken += 1

        val hometown: String = "Johnson City"
        val age: Int = 22
        val temperature: Double = 72.5
        val likesKotlin: Boolean = true


        println("$firstName is majoring in $major")
        println("Next year I will be ${age + 1}")
        println("My name has ${firstName.length} letters")

        print("What is your favorite class? ")
        val favoriteClass = readln()
        println("$favoriteClass sounds like a good class.")
        println("My favorite food is $favoriteFood")
        println("I have taken $cscCoursesTaken CSC courses")
        println("The temperature is $temperature degrees")
        println("Do I like Kotlin? $likesKotlin")
    }

