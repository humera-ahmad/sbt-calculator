package com.knoldus.CalculatorApi

class CalculatorApi {
  def addition (firstNumber : Int , secondNumber : Int) : Int  = {
    firstNumber + secondNumber
  }

  def subtraction(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber - secondNumber
  }

  def multiplication(firstNumber : Int , secondNumber : Int) : Int = {
    firstNumber * secondNumber
  }

  def division (firstNumber : Int , secondNumber : Int) : Int = {
    try {
      firstNumber / secondNumber
    }
    catch {
      case e: ArithmeticException => 0
    }
  }

  def power(firstNumber: Int, secondNumber: Int): Double = {
    Math.pow(firstNumber, secondNumber)
  }

  def absolute(number:Int):Int = {
    Math.abs(number)
  }

  def modulus(firstNumber:Int , secondNumber:Int):Int = {
    firstNumber % secondNumber
  }

  def maximum(firstNumber:Int , secondNumber:Int):Int = {
    if(firstNumber > secondNumber){
      firstNumber
    }
    else {
      secondNumber
    }
  }

  def minimum(firstNumber:Int,secondNumber:Int):Int = {
    if(firstNumber < secondNumber){
      firstNumber
    }
    else {
      secondNumber
    }
  }
}
