package io.github.agbaroni.tests.scala

object Main {
  def fact(n: Int): Int = {
    if (n < 2)
      return 1
    else
      return n * fact(n - 1)
  }

  def main(args: Array[String]): Unit = {
    println("ciao")
    println(fact(10))
  }
}
