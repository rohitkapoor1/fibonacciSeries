package org.fibonacci.examples
/**
 * Fibonacci series: 1,1,2,3,5,8,13
 * nth Fibonacci -> fibo(3) = 2, fibo(5) = 5, fibo(6) = 8 and so on
*/
object nthFibonacciArrayImpl extends App {

  if (args.length != 1) {
    throw new Exception("provide one number as input")
  }
  else{
    try {
      val n = args(0).toInt
      if (n < 0) {
        throw new Exception("input cannot be negative")
      }
      else {
        println("nth Fibonacci fo n: " + n + " is " + fibo(n))
      }
    }
    catch {
      case e: ArrayIndexOutOfBoundsException => println("Error processing nth Fibonacci")
      case _: Throwable => println("invalid input")
    }
  }

  def fibo(n: Int): Int = {

    if ( n <= 2) {
      return 1
    }
    val arr = Array.fill(n)(0)
    arr(0) = 1
    arr(1) = 1
    for (i <- 2 to n-1) {
      arr(i) = arr(i-2) + arr(i-1)
    }
    arr(n-1)
  }

}
