import Server.Receiver
import akka.actor.{ActorSystem, Props}

object Client {
  implicit val system = ActorSystem("ExampleSystem")

  val client = system.actorOf(Props(Server.destination))
  def NewOrder(name:String,typeof:String,material:String): Unit ={
    client ! new AddNotify(name,typeof,material)
  }
  def FindOrder(name:String): Unit ={
    client ! new FindNotify(name)
  }
  def DeleteOrder(name:String): Unit = {
    client!new DeleteNotify(name)
  }



}
