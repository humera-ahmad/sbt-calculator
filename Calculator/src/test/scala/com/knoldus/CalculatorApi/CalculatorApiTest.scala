package com.knoldus.CalculatorApi

import org.scalatest.flatspec.AnyFlatSpec

class CalculatorApiTest extends AnyFlatSpec {
  val calculatorApi = new CalculatorApi

  "CalculatorApi" should "return the correct addition" in {
    val result = calculatorApi.addition(54,46)
    assertResult(100)(result)
  }

  it should "return the negative number after addition" in {
    val result = calculatorApi.addition(-54,46)
    assertResult(-8)(result)
  }

  it should "return the correct subtraction" in {
    val result = calculatorApi.subtraction(54,46)
    assertResult(8)(result)
  }

  it should "return the negative value after subtraction" in {
    val result = calculatorApi.subtraction(46,54)
    assertResult(-8)(result)
  }

  it should "return the correct multiplication" in {
    val result = calculatorApi.multiplication(46,54)
    assertResult(2484)(result)
  }

  it should "return the negative value after multiplication" in {
    val result = calculatorApi.multiplication(46,-54)
    assertResult(-2484)(result)
  }

  it should "return the correct division" in {
    val result = calculatorApi.division(45,3)
    assertResult(15)(result)
  }

  it should "return the negative value after division" in {
    val result = calculatorApi.division(-45,3)
    assertResult(-15)(result)
  }

  it should "return invalid as it is an exception" in {
    val result = calculatorApi.division(1,0)
    assertResult(0)(result)
  }

  it should "return the correct result" in {
    val result = calculatorApi.power(2,3)
    assertResult(8)(result)
  }

  it should "return the correct result when power is negative" in {
    val result = calculatorApi.power(2,-3)
    assertResult(0.125)(result)
  }

  it should "return the correct absolute value" in {
    val result = calculatorApi.absolute(-248)
    assertResult(248)(result)
  }

  it should "not change the value" in {
    val result = calculatorApi.absolute(3)
    assertResult(3)(result)
  }

  it should "return the correct modulus" in {
    val result = calculatorApi.modulus(45,3)
    assertResult(0)(result)
  }

  it should "return the negative value after taking mod" in {
    val result = calculatorApi.modulus(-16,3)
    assertResult(-1)(result)
  }

  it should "return the first number as maximum" in {
    val result = calculatorApi.maximum(45,3)
    assertResult(45)(result)
  }

  it should "return the second number as maximum" in {
    val result = calculatorApi.maximum(1,3)
    assertResult(3)(result)
  }

  it should "return the first number as minimum" in {
    val result = calculatorApi.minimum(-45,3)
    assertResult(-45)(result)
  }

  it should "return the second number as minimum" in {
    val result = calculatorApi.minimum(45,3)
    assertResult(3)(result)
  }

}
