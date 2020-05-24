import akka.actor.Actor

import scala.collection.mutable.ListBuffer

object Server {

  class Receiver extends Actor {
    override def receive = {
      case AddNotify(name, typeof, material) => {
        listOfOrders.append(new Order(name, typeof, material))
        println(s"Added new order named $name")
      }
      case DeleteNotify(name) => {
        val index = listOfOrders.indexWhere(p => p.GetName() == name)
        listOfOrders.remove(index)
        println(s"Deleted order named $name")
      }
      case FindNotify(name) => {
        val index=listOfOrders.indexWhere(p => p.GetName() == name)
        if(index==(-1)) println(s"No order named $name")
        else println(listOfOrders(index))
      }
    }
  }
  val destination =new Receiver
  lazy val listOfOrders:ListBuffer[Order] = new ListBuffer[Order]
}

