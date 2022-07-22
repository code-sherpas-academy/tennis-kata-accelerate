package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class RomanNumeralsTest {

    @Test
    fun `1, 2, 3 are converted to I, II, III`() {
        Assertions.assertThat(arabicToRomanNumeral(1)).isEqualTo("I")
        Assertions.assertThat(arabicToRomanNumeral(2)).isEqualTo("II")
        Assertions.assertThat(arabicToRomanNumeral(3)).isEqualTo("III")
    }

    @Test
    fun `5 is converted to V`() {
        Assertions.assertThat(arabicToRomanNumeral(5)).isEqualTo("V")
    }

    @Test
    fun `6, 7 and 8 are converted to VI, VII and VIII`() {
        Assertions.assertThat(arabicToRomanNumeral(6)).isEqualTo("VI")
        Assertions.assertThat(arabicToRomanNumeral(7)).isEqualTo("VII")
        Assertions.assertThat(arabicToRomanNumeral(8)).isEqualTo("VIII")
    }

    private fun arabicToRomanNumeral(arabic: Int): String {
        var roman = ""

        if (arabic in 1..3) {
            repeat(arabic) { roman += "I" }
            return roman
        }

        if (arabic == 5) return "V"
        if (arabic == 6) return "VI"
        if (arabic == 7) return "VII"
        return "VIII"
    }
}