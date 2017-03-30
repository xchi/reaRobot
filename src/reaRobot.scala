/**
  * Created by vivian.chi on 3/21/17.
  */
object Direction extends Enumeration {
  val North,East,South,West = Value
}

object Turn extends Enumeration {
  val Left,Right = Value
}


class robot(var coordinateX:Int, var coordinateY:Int, var direction:Direction.Value){
  def move():Unit={
    def directionMatch(d:Direction.Value)=d match{
      case Direction.North=>coordinateY=coordinateY+1
      case Direction.East=>coordinateY=coordinateY+1
      case Direction.South=>coordinateY=coordinateY+1
      case Direction.West=>coordinateY=coordinateY+1
    }

  }

  def turn(turn:Turn.Value):Unit={

  }

}




object reaRobot {
  def main(args: Array[String]): Unit = {

  }
}
