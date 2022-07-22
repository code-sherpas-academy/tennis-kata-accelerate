package tennis.kata.accelerate

fun fizzBuzz(number: Int): String {
    return when {
        number % 15 == 0 -> "FizzBuzz"
        number % 3 == 0 -> "Fizz"
        number % 5 == 0 -> "Buzz"
        else -> number.toString()
    }
}

fun main() {
    (1..100)
        .forEach { number -> println("$number -> ${fizzBuzz(number)}") }
}