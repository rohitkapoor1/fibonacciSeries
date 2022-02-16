package org.fibonacci.examples

import org.scalatest.FunSuite

class fibonacciTestSuite extends FunSuite {

  test("test recursive implementation") {
    assert(nthFibonacciRecursive.fibo(8) === 21)
  }
  test("test recursive implementation with input 1") {
    assert(nthFibonacciRecursive.fibo(1) === 1)
  }
  test("test recursive implementation with input 2") {
    assert(nthFibonacciRecursive.fibo(1) === 1)
  }

  test("test Array based implementation with input 1") {
    assert(nthFibonacciArrayImpl.fibo(1) === 1)
  }
  test("test Array based implementation with input 2") {
    assert(nthFibonacciArrayImpl.fibo(1) === 1)
  }
  test("test Array based implementation") {
    assert(nthFibonacciArrayImpl.fibo(6) === 8)
  }

  test("test optimised iterative implementation with input 1") {
    assert(nthFibonacciOptimised.fibo(1) === 1)
  }
  test("test optimised iterative implementation with input 2") {
    assert(nthFibonacciOptimised.fibo(1) === 1)
  }

  test("test optimised iterative implementation") {
    assert(nthFibonacciOptimised.fibo(5) === 5)
  }

}
