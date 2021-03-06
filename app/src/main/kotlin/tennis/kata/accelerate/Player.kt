/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package tennis.kata.accelerate

class Player {
    var points: Int = 0

    fun increaseScore(playerScore: Int) {
        if (playerScore == 30) points += 10
    }

    val greeting: String
        get() {
            return "Hello World!"
        }
}

fun main() {
    println(Player().greeting)
}
