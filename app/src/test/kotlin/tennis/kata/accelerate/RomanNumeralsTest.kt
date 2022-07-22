package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `1 is converted to I`() {
        Assertions.assertThat(arabicToRomanNumeral(1)).isEqualTo("I")
    }

    @Test
    fun `2 is converted to II`() {
        Assertions.assertThat(arabicToRomanNumeral(2)).isEqualTo("II")
    }

    private fun arabicToRomanNumeral(arabic: Int): String {
        if (arabic == 1) return "I"
        return "II"
    }
}