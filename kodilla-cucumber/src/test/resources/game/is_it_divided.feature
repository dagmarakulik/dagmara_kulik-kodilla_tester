Feature: Is it divided?
  Everybody plays the game

  Scenario Outline: Divided or not
    Given Number is <number>
    When I ask whether the number is divided
    Then It should be returned <result>
    Examples:
      | number | result |
      | 3 | "Fizz" |
      | 5 | "Buzz" |
      | 15 | "FizzBuzz" |
      | 4 | "None" |
      | 30 | "FizzBuzz" |
      | 25 | "Buzz" |