object Main {
 def main(args:Array[String]): Unit ={

   Client.FindOrder("Oleg")
   Client.NewOrder("Oleg","Jacket","Cotton")
   Client.NewOrder("Vlad","Shirt","Cotton")
  Client.NewOrder("Kate","Dress","Cotton")
  Client.FindOrder("Vlad")
  Client.FindOrder("Oleg")
  Client.FindOrder("Kate")
  Client.DeleteOrder("Vlad")
  Client.FindOrder("Vlad")
 }
}
