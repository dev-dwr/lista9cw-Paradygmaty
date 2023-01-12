class EmptyExce(msg: String = "empty queue error") extends Exception(msg)

class MyQueue[+A] private(private val queue: (List[A], List[A])) {
  //wymuszenie niemodyfikalnosci
  def enqueue[B >: A](newEl: B): MyQueue[B] = {
    val (beginningOfQueue, endOfQueue) = queue
    normalize(beginningOfQueue, newEl :: endOfQueue)
  }

  private def normalize[B >: A](list1: List[B], list2: List[B]) =
    (list1, list2) match {
      case (Nil, endOfQueue) => new MyQueue[B]((endOfQueue.reverse, Nil))
      case normalQueue => new MyQueue(normalQueue)
    }

  def dequeu: MyQueue[A] = {
    queue match
      case (Nil, _) => new MyQueue[A]((Nil, Nil))
      case (_ :: t, endQueue) => if (t == Nil) new MyQueue[A]((endQueue.reverse, Nil)) else new MyQueue[A]((t, endQueue))
  }

  //k
  def first: A = {
    queue match
      case (Nil, _) => throw new EmptyExce("empty")
      case (h :: _, _) => h
  }

  //k
  def isEmpty: Boolean = {
    queue._1 == Nil
  }
}

object MyQueue {
//  def apply[T](xs: T*) = new MyQueue[T](xs.toList, Nil)

  def empty[T] = new MyQueue[T](Nil, Nil)
}

