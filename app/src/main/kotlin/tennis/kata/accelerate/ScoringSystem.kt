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
        var score: String = ""
        if (scorePlayer1 < 3 && scorePlayer2 < 3 || scorePlayer1 <= 3 && scorePlayer2 < 3) {
            score = "${singleScoreToString(scorePlayer1)}:${singleScoreToString(scorePlayer2)}"
        } else if(scorePlayer1 >= 3 && scorePlayer2 >= 3) {
            if(scorePlayer1 == scorePlayer2) {
                score = "DEUCE"
            } else if (scorePlayer1 > scorePlayer2) {

                if (scorePlayer1 - scorePlayer2 == 1) {
                    score = "ADVANTADGE:40"
                } else if (scorePlayer1 - scorePlayer2 == 2) {
                    score = "Player 1 wins the GAME"
                }

            } else {
                if (scorePlayer2 - scorePlayer1 == 1) {
                    score = "40:ADVANTADGE"
                } else if (scorePlayer2 - scorePlayer1 == 2) {
                    score = "Player 2 wins the GAME"
                }
            }
        }

        return score
    }

    private fun singleScoreToString(score: Int): String {
        return if (score == 0) "LOVE"
        else if (score == 1) "15"
        else if (score == 2) "30"
        else if (score == 3) "40"

        else throw UnsupportedOperationException()
    }



}

enum class Player {
    ONE, TWO
}