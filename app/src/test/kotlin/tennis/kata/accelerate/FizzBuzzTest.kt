package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {
  @Test
  fun multiplesOfThreeAreConvertedToFizz() {

    Assertions.assertThat(fizzBuzz(3)).isEqualTo("Fizz")
  }

  private fun fizzBuzz(number: Int): String {
    return "Fizz"
  }
}