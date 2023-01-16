//zadanie 3
object Lista9 extends App {
  new Vehicle("producer", "model")
  new Vehicle("producer", "model", 1111)

  new Vehicle("producer", "model", 1111,
    "number_registration") //main constructor
  new Vehicle("producer", "model", registrationNumber = "number-some")

  val time3 = new Time3(21, 15);
  println(time3.getMinute)
}
