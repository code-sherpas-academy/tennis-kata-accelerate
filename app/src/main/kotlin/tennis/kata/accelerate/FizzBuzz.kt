package tennis.kata.accelerate

fun fizzBuzz(number: Int): String {
    if(number % 3 == 0) return "Fizz"

    return "Buzz"
}

fun main() {
    (1..100)
        .forEach { number -> println(fizzBuzz(number)) }
}