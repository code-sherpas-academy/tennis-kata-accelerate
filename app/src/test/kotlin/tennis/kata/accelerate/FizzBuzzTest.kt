package tennis.kata.accelerate

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FizzBuzzTest {
  @ParameterizedTest
  @CsvSource("3, 6, 9, 12")
  fun multiplesOfThreeAreConvertedToFizz(number: Int) {
    assertThat(fizzBuzz(number)).isEqualTo("Fizz")
  }

  @ParameterizedTest
  @CsvSource("5, 10, 20, 25")
  fun multiplesOfFiveAreConvertedToBuzz(number: Int) {
    assertThat(fizzBuzz(number)).isEqualTo("Buzz")
  }

  @ParameterizedTest
  @CsvSource("15, 30, 45, 60")
  fun multiplesOf15AreConvertedToFizzBuzz(number: Int) {
    assertThat(fizzBuzz(number)).isEqualTo("FizzBuzz")
  }

  @ParameterizedTest
  @CsvSource("1,2,4,7,8,11")
  fun normalNumbersAreNotConverted(number: Int) {
    assertThat(fizzBuzz(number)).isEqualTo(number.toString())
  }
}