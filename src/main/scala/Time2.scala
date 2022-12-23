//zadanie 2 a
class Time2(private var hour: Int, private var minute: Int) {
  if (!(0 <= hour && hour < 24)) throw new IllegalArgumentException()
  if (!(0 <= minute && minute < 60)) throw new IllegalArgumentException()

  def getHour: Int = hour;

  def getMinute: Int = minute;

  def setHour(givenHour: Int) = {
    if (givenHour < 0) hour = 0
    else hour = givenHour
  }

  def setMinute(givenMinute: Int) = {
    if (givenMinute < 0) minute = 0
    else minute = givenMinute
  }

  def beforeTime(other: Time2): Boolean = {
    return hour < other.hour || minute < other.minute && other.hour == hour
  }

}
