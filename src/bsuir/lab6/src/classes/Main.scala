package classes

import scala.collection.mutable.ListBuffer

object Main {
  val mylist:List[String]=List("sfsdf","sfs","dfgdsfgsdfg","sdfsdsdfergrebteyb","sdf","sdfsdfwe","s");
  val myseclist:List[String]=List("sda","jhgfkyu","uik","g","ghjhgfjfghkiumjg","fgh");
  val newlist:ListBuffer[String]=ListBuffer();



  def sortpred(i: String,k:String) ={
    i.length>k.length
  }


  def highSort(predicate: (String,String)=>Boolean): Unit={
    newlist.addAll(mylist)
    newlist.addAll(myseclist)
    val sortedlist =newlist.sortWith(_.length>_.length)
    println(sortedlist)
  }

  def main(args:Array[String]): Unit = {
    highSort(sortpred)
  }
}
