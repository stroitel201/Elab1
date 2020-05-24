abstract class Notification

case class AddNotify(name:String,typeof:String,material:String) extends Notification
case class FindNotify(name:String) extends Notification
case class DeleteNotify(name:String) extends Notification