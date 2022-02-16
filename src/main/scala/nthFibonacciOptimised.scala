package org.fibonacci.examples

object nthFibonacciOptimised extends App {

  if (args.length != 1) {
    throw new Exception("provide a number")
  }
  else {
    try {
      val n = args(0).toInt
      if (n < 0) {
        throw new Exception("input cannot be negative")
      }
      else{
        println("nth Fibonacci fo n: " + n + " is " + fibo(n))
      }
    }
    catch {
      case _: Throwable => println("Error processing")
    }
  }

  def fibo(n: Int): Int = {
    if (n <= 2) {
      1
    }
    else {
      var i = 1
      var j = 1
      var nthFibo = 2

      for (x <- 3 to n) {
        nthFibo = i + j
        i = j
        j = nthFibo
      }
      nthFibo
    }
  }
}
