package org.fibonacci.examples
/**
 * Fibonacci series: 1,1,2,3,5,8,13
 * nth Fibonacci -> fibo(3) = 2, fibo(5) = 5, fibo(6) = 8 and so on
 */
object nthFibonacciRecursive extends App {

  if (args.length != 1) {
    throw new Exception("Invalid input")
  }
  val n = args(0).toInt
  if (n < 0) {
    throw new Exception("input cannot be negative")
  }
  else{
    println("nth Fibonacci fo n: " + n + " is " + fibo(n))
  }

  def fibo(n: Int) : Int = {
    if (n <= 2) {
      return 1
    }
    else {
      return fibo(n-2) + fibo(n-1)
    }
  }

}
