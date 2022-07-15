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
}