class Order( name: =>String, typeof: =>String, material: =>String)
{
  def GetName() = name
  def GetType()=typeof
  def GetMat()=material

  override def toString: String = s"INFO Order: $name, $typeof,$material"
}