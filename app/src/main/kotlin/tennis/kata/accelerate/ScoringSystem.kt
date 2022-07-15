package tennis.kata.accelerate

class ScoringSystem(
    var scorePlayer1: Int = 0,
    var scorePlayer2: Int = 0) {

    fun winnerForBall(player: Player) {
        when (player) {
            Player.ONE -> scorePlayer1 ++
            Player.TWO -> scorePlayer2 ++
        }
    }

    fun currentScore(): String {
        var score = ""
        if (scorePlayer1 <= 3 && scorePlayer2 < 3 ||
            scorePlayer1 < 3 && scorePlayer2 <= 3) {
            score = "${singleScoreToString(scorePlayer1)}:${singleScoreToString(scorePlayer2)}"
        } else if(scorePlayer1 >= 3 && scorePlayer2 >= 3) score = higherScoreCalculation(score)

        return score
    }

    private fun higherScoreCalculation(score: String): String {
        var score1 = score
        if (scorePlayer1 == scorePlayer2) {
            score1 = Score.DEUCE.value
        } else if (scorePlayer1 > scorePlayer2) {

            if (scorePlayer1 - scorePlayer2 == 1) {
                score1 = "${Score.ADVANTAGE.value}:40"
            } else if (scorePlayer1 - scorePlayer2 == 2) {
                score1 = "Player 1 wins the GAME"
            }

        } else {
            if (scorePlayer2 - scorePlayer1 == 1) {
                score1 = "40:${Score.ADVANTAGE.value}"
            } else if (scorePlayer2 - scorePlayer1 == 2) {
                score1 = "Player 2 wins the GAME"
            }
        }
        return score1
    }

    private fun singleScoreToString(score: Int): String {
        return when (score) {
            0 -> "LOVE"
            1 -> "15"
            2 -> "30"
            3 -> "40"
            else -> throw UnsupportedOperationException()
        }
    }



}

enum class Score(var value: String) {
    DEUCE("DEUCE"), ADVANTAGE("ADVANTAGE")
}

enum class Player {
    ONE, TWO
}