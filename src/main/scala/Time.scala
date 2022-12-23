//zadanie 1 a
class Time(private var hour: Int) {
  if (hour < 0) {
    hour = 0
  }

  def setHour(givenHour: Int) = {
    if (givenHour < 0) hour = 0
    else hour = givenHour
  }

  def getHour: Int = hour

}
