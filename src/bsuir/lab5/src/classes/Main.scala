package classes
import scala.collection.mutable.ListBuffer
import scala.io.StdIn
object Main {
    val mylist:List[Int]=List(1,2,3,4,5,6,7,8,9,10,11,12,234,23,31,54,73);

    //нерекурсивно
    def isPrime(i: Int): Boolean =
      if (i <= 1)
        false
      else if (i == 2)
        true
      else
        !(2 until i).exists(n => i % n == 0)


    /////рекурсивно
    def isPrimeRec(n: Int): Boolean = {
      def isPrimeUntil(t: Int): Boolean = t == 1 || t > 1 && n%t != 0 && isPrimeUntil(t-1)
      isPrimeUntil(n/2)
    }


    def primesUnder(n: Int): List[Int] = {
      require(n >= 2)

      def rec(i: Int, primes: List[Int]): List[Int] = {
        if (i >= n) primes
        else if (prime(i, primes)) rec(i + 1, i :: primes)
        else rec(i + 1, primes)
      }

      rec(2, List()).reverse
    }

    def prime(num: Int, factors: List[Int]): Boolean = factors.forall(num % _ != 0)


    def main(args:Array[String]): Unit = {
      println(primesUnder(1000))
      println(mylist.filter(isPrime))
      println(mylist.filter(isPrimeRec))
    }
  
}
