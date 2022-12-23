//zadanie 2 a
class Time3(private var hour: Int, private var minute: Int) {
  if (!(0 <= hour && hour < 24)) throw new IllegalArgumentException()
  if (!(0 <= minute && minute < 60)) throw new IllegalArgumentException()

  private var minutesAfterMidnight = hour * 60 + minute

  def getHour: Int = minutesAfterMidnight / 60;

  def getMinute: Int = minutesAfterMidnight % 60;

  def setHour(givenHour: Int) = {
    if (!(0 <= givenHour && givenHour < 24)) throw new IllegalArgumentException();
    else minutesAfterMidnight = givenHour*60 + minute;
  }

  def setMinute(givenMinute: Int) = {
    if (!(0 <= minute && minute < 60)) throw new IllegalArgumentException()
    else minutesAfterMidnight = hour + givenMinute;
  }

  def beforeTime(other: Time3): Boolean = {
    return minutesAfterMidnight < other.minutesAfterMidnight
  }

}
