package tennis.kata.accelerate

fun fizzBuzz(number: Int): String {
    if(number % 15 == 0) return "FizzBuzz"
    if(number % 3 == 0) return "Fizz"
    if(number % 5 == 0) return "Buzz"
    return number.toString()
}

fun main() {
    (1..100)
        .forEach { number -> println("$number -> ${fizzBuzz(number)}") }
}