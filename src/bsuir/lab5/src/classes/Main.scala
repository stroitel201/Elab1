package classes

object Main {
  val mylist:List[Int]=List(1,2,3,4,5,6,7,8,9,10,11,12,234,23,31,54,73);
  def isPrime(i: Int): Boolean =
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until i).exists(n => i % n == 0)
  def main(args:Array[String]): Unit = {
    println(mylist.filter(isPrime))
  }
}
