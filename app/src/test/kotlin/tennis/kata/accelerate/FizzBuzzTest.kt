package tennis.kata.accelerate

import org.assertj.core.api.Assertions
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FizzBuzzTest {
  @ParameterizedTest
  @CsvSource("3, 6, 9, 12")
  fun multiplesOfThreeAreConvertedToFizz(number: Int) {
    Assertions.assertThat(fizzBuzz(number)).isEqualTo("Fizz")
  }

  @ParameterizedTest
  @CsvSource("5, 10, 20, 25")
  fun multiplesOfFiveAreConvertedToBuzz(number: Int) {
    Assertions.assertThat(fizzBuzz(number)).isEqualTo("Buzz")
  }

}