object Zadanie4Wyjatki {
  def main(args: Array[String]) = {
    try {
      metoda1()
    } catch {
      case e: Exception =>
        System.err.println(e.getMessage + "\n")
        e.printStackTrace()
    }
  }

  def metoda1() = {
    metoda2()
  }

  def metoda2() = {
    metoda3()
  }

  def metoda3() = {
    throw new Exception("Exception method 3")
  }
}

//java.lang.Exception: Exception method 3
//at Zadanie4Wyjatki$
//.metoda3(Zadanie4Wyjatki.scala: 21)
//at Zadanie4Wyjatki$
//.metoda2(Zadanie4Wyjatki.scala: 17)
//at Zadanie4Wyjatki$
//.metoda1(Zadanie4Wyjatki.scala: 13)
//at Zadanie4Wyjatki$
//.main(Zadanie4Wyjatki.scala: 4)
//at Zadanie4Wyjatki
//.main(Zadanie4Wyjatki.scala)