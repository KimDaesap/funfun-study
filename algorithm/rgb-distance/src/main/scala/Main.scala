
object Main extends App {
  val inputs1 = List(List(26, 40, 83), List(49, 60, 57), List(13, 89, 99))
  val inputs2 = List(List(1, 20, 30), List(50, 5, 6), List(9, 3, 7))
  val inputs3 = List(List(1, 2, 3), List(5, 8, 2))
  println(RgbDistance.process(inputs1))
  println(RgbDistance.process(inputs2))
  println(RgbDistance.process(inputs3))
}

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

object RgbDistance {
  import Colors._
  type Houses = List[List[Int]]

  def process(inputs: Houses): Int = {
    inputs match {
      // "처음 집과 마지막 집은 이웃이 아니다." 에 대한 예외 처리.
      case h1 :: h2 :: Nil =>
        ???

      case h :: t => (
          for {
            colorPrice <- Colors.values.zip(h)
          } yield loop(colorPrice, t)
        ).min
    }

    def loop(colorPrice: (Color, Int), t: Houses): Int = {
      ???
    }
  }
}



