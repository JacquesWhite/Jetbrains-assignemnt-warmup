import scala.annotation.tailrec


object PowerOfTwo extends App {

  def f(x: Int): Int = {
    if(x == 0) 1 else f(x-1) + f(x-1);
  }
  println("f(10) = " + f(10))
  // time O(2^x)
  // space )(2^x)


  def f1(x: Int): Int = {
    if(x == 0) 1 else 2 * f1(x-1);
  }
  println("f1(10) = " + f1(10))
  // time O(x)
  // space O(x)


  @tailrec
  def f2(x: Int, result: Int = 1): Int = {
    if (x == 0) result
    else f2(x - 1, result * 2)
  }
  println("f2(10) = " + f2(10))
  // time O(x)
  // space O(1)


  def f3(x: Int): Int = {
    1 << x
  }
  println("f3(10) = " + f3(10))
  // time O(1)
  // space O(1)
}
