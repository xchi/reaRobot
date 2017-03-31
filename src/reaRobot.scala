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

    directionMatch(direction)

  }

  def turn(turn:Turn.Value):Unit={
    def turnMatch(t:Turn.Value)=t match{
      case Turn.Left=>direction=Direction(direction.id+1)
      case Turn.Right=>direction=Direction(direction.id-1)
    }
    turnMatch(turn)
  }

  def printResult():Unit={
    println(coordinateX+","+coordinateY+","+direction)

  }

}




object reaRobot {
  def main(args: Array[String]): Unit = {

    var robot=new robot(2,3,Direction.South)
    robot.move()
    robot.turn(Turn.Right)
    robot.printResult()

  }
}
