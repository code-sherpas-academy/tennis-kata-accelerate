package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `1 is converted to I`() {
        Assertions.assertThat(arabicToRomanNumeral(1)).isEqualTo("I")
    }

    private fun arabicToRomanNumeral(arabic: Int): String {
        return "I"
    }
}