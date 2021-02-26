package com.knoldus.CalculatorImpl

import com.knoldus.CalculatorApi.CalculatorApi

class CalculatorImpl()
{
  def option(choice: Int, first: Int,second: Int): AnyVal =
  {
    val calculator = new CalculatorApi

    choice match
    {
      case 1 => calculator.Addition(first, second)
      case 2 => calculator.Subtraction(first, second)
      case 3 => calculator.Multiplication(first, second)
      case 4 => calculator.Division(first, second)
      case 5 => calculator.Power(first, second)
      case 6 => calculator.Absolute(first)
      case 7 => calculator.Modulus(first, second)
      case 8 => calculator.Maximum(first, second)
      case 9 => calculator.Minimum(first, second)
    }
  }
}

