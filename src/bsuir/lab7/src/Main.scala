import scala.collection.mutable.ListBuffer

object Main {

  val newlist:ListBuffer[Int]=ListBuffer();
  val mylist:List[Int]=List(1,2,3,4,5,6,7,8,9,10,11,12,234,23,31,54,73)

  def isPrime(i: Int): Boolean =
    if (i <= 1)
      false
    else if (i == 2)
      true
    else
      !(2 until i).exists(n => i % n == 0)

  def PrimeOrNot(x:Int):Unit={
    val flag:Boolean=isPrime(x)
    flag match{
      case true=>newlist.append(x/2)
      case false=>newlist.append(x/3)
    }
  }
  def main(args:Array[String]): Unit = {
    mylist.foreach(PrimeOrNot)
    println(newlist)
  }
}
