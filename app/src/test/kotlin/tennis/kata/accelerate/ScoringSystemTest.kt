package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ScoringSystemTest {

    @Test
    fun `initial score is LOVE-LOVE`() {
        Assertions.assertThat(ScoringSystem(0, 0).currentScore()).isEqualTo("LOVE:LOVE")
    }

    @Test
    fun `previous score LOVE-LOVE and player one wins then current score is 15-LOVE`() {
        val scoringSystem = ScoringSystem(0, 0)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("15:LOVE")
    }

    @Test
    fun `previous score LOVE-LOVE and player two wins then current score is LOVE-15`() {
        val scoringSystem = ScoringSystem(0, 0)

        scoringSystem.winnerForBall(Player.TWO)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("LOVE:15")
    }

    @Test
    fun `previous score 30-40 and player one wins then current score is DEUCE`() {
        val scoringSystem = ScoringSystem(2, 3)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("DEUCE")
    }

    @Test
    fun `previous score 40-40 and player one wins then current score is ADVANTADGE-40`() {
        val scoringSystem = ScoringSystem(3, 3)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("ADVANTADGE:40")
    }

    @Test
    fun `previous score ADVANTADGE-40 and player one wins then Player 1 wins the GAME`() {
        val scoringSystem = ScoringSystem(4, 3)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("Player 1 wins the GAME")
    }

    @Test
    fun `previous score 40-ADVANTADGE and player two wins then Player 2 wins the GAME`() {
        val scoringSystem = ScoringSystem(3, 4)

        scoringSystem.winnerForBall(Player.TWO)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("Player 2 wins the GAME")
    }

    @Test
    fun `previous score 4-5 and player one wins then current score is DEUCE`() {
        val scoringSystem = ScoringSystem(4, 5)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("DEUCE")
    }
}