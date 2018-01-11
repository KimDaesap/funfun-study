object Colors extends Enumeration {
  val Red, Green, Blue = Value
  val size = values.size
  type Color = Value
  implicit def toInt(c: Colors.Value): Int = c.id
  implicit class ColorOps(color: Color) {
    def right: Color = Colors((color.id + 1) % size)
    def left: Color = Colors((color.id + 2) % size)
  }
}

import Colors._

Red.left
Red.right

val inputs = List(List(26, 40, 83), List(49, 60, 57), List(13, 89, 99))

val inputs2: List[List[Int]] = List()


val min = inputs2 map { case h :: t => h } match {
  case Nil => throw new Exception("empty inputs")
  case list => list.min
}


