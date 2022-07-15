package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

internal class ScoringSystemTest {

    @Test
    fun `0-0 is LOVE-LOVE`() {
        Assertions.assertThat(ScoringSystem(0, 0).currentScore()).isEqualTo("LOVE:LOVE")
    }

    @Test
    fun `0-0 then 15-LOVE`() {
        val scoringSystem = ScoringSystem(0, 0)

        scoringSystem.winnerForBall(Player.ONE)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("15:LOVE")
    }

    @Test
    fun `0-0 then LOVE-15`() {
        val scoringSystem = ScoringSystem(0, 0)

        scoringSystem.winnerForBall(Player.TWO)

        Assertions.assertThat(scoringSystem.currentScore()).isEqualTo("LOVE:15")
    }
}