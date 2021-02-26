package com.knoldus.CalculatorApi

class CalculatorApi {
  // This method adds two numbers
  def Addition (firstNumber : Int , secondNumber : Int) : Int  = {
    firstNumber + secondNumber
  }

  // This method subtracts number2 from number1
  def Subtraction(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber - secondNumber
  }

  // This method multiplies two numbers
  def Multiplication(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber * secondNumber
  }

  // This method is to perform division
  def Division (firstNumber : Int , secondNumber : Int) : Int = {
    if (secondNumber==0)
    {
      println("Denominator cannot be zero")
      0
    }
    else
      firstNumber / secondNumber
  }

  // This method is for calculating power of a number
  def Power(firstNumber: Int, secondNumber: Int): Double = {
    Math.pow(firstNumber, secondNumber)
  }

  // This method is for calculating absolute value
  def Absolute(number:Int):Int = {
    Math.abs(number)
  }

  // Method for calculating modulus
  def Modulus(firstNumber:Int , secondNumber:Int):Int = {
    firstNumber % secondNumber
  }

  // Method for calculating maximum among two number
  def Maximum(firstNumber:Int , secondNumber:Int):Int = {
    if(firstNumber > secondNumber)
      firstNumber
    else
      secondNumber
  }

  // Method for calculating minimum among two numbers
  def Minimum(firstNumber:Int,secondNumber:Int):Int = {
    if(firstNumber<secondNumber)
      firstNumber
    else
      secondNumber
  }
}
