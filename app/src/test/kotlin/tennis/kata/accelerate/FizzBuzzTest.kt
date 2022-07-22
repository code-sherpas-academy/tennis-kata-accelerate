package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class FizzBuzzTest {
  @Test
  fun multiplesOfThreeAreConvertedToFizz() {
    Assertions.assertThat(fizzBuzz(3)).isEqualTo("Fizz")
  }

  @Test
  fun multiplesOfFiveAreConvertedToBuzz() {
    Assertions.assertThat(fizzBuzz(5)).isEqualTo("Buzz")
  }

}