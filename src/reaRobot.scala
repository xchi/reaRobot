/**
  * Created by vivian.chi on 3/21/17.
  */
object Direction extends Enumeration {
  val North,East,South,West = Value
}

object Turn extends Enumeration {
  val Left,Right = Value
}


class robot(coordinateX:Int, coordinateY:Int, direction:Direction.Value){
  def move():Unit={

  }

  def turn(turn:Turn.Value):Unit={

  }

}




object reaRobot {
  def main(args: Array[String]): Unit = {

  }
}
