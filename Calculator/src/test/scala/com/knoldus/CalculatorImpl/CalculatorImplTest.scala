package com.knoldus.CalculatorImpl

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorImplTest extends AnyFlatSpec {

  val calculatorImpl = new CalculatorImpl

  "CalculatorImpl" should "return addition" in {
    val result = calculatorImpl.option(1,4,2)
    assertResult(6)(result)
  }

  it should "return subtraction" in {
    val result= calculatorImpl.option(2,4,2)
    assertResult(2)(result)
  }

  it should "return multiplication" in {
    val result= calculatorImpl.option(3,4,2)
    assertResult(8)(result)
  }

  it should "return division" in {
    val result= calculatorImpl.option(4,4,2)
    assertResult(2)(result)
  }

  it should "return power" in {
    val result= calculatorImpl.option(5,4,2)
    assertResult(16.0)(result)
  }

  it should "return absolute value" in {
    val result= calculatorImpl.option(6,4,2)
    assertResult(4)(result)
  }

  it should "return modulus" in {
    val result= calculatorImpl.option(7,4,2)
    assertResult(0)(result)
  }

  it should "return maximum" in {
    val result= calculatorImpl.option(8,4,2)
    assertResult(4)(result)
  }

  it should "return minimum" in {
    val result = calculatorImpl.option(9,4,2)
    assertResult(2)(result)
  }

}
