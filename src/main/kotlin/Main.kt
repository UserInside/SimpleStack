
fun main() {
//    val stack = Stack()
//    stack.push(4)
//    stack.push(1)
//    stack.push(3)
//    stack.pop()
//    stack.push(8)
//    stack.pop()
//
//    println()
//
//    val queue = Queue(6)
//    queue.enqueue(4)
//    queue.enqueue(1)
//    queue.enqueue(3)
//    queue.dequeue()
//    queue.enqueue(8)
//    queue.dequeue()
//    queue.enqueue(1)
//    queue.enqueue(7)
//    queue.enqueue(2)
//    queue.dequeue()
//    queue.dequeue()
//    queue.enqueue(4)
//    queue.enqueue(8)
//    queue.enqueue(5)
//    queue.enqueue(77)
//    repeat(7) { queue.dequeue() }

    val qDS:QueueDoubleSided = QueueDoubleSided(6)
    println()
    println("---/ добавляем с хвоста")
    qDS.enqueueOnTail(1)
    qDS.enqueueOnTail(2)
    qDS.enqueueOnTail(3)
    qDS.enqueueOnTail(4)
    println()

    println("---/ удаляем с головы")
    qDS.dequeueOnHead()
    qDS.dequeueOnHead()
    qDS.dequeueOnHead()
    println()

    println("---/ добавляем с головы")
    qDS.enqueueOnHead(9)
    qDS.enqueueOnHead(10)
    qDS.enqueueOnHead(11)
    println()

    println("---/ удаляем с хвоста")
    qDS.dequeueOnTail()
    qDS.dequeueOnTail()
    qDS.dequeueOnTail()
    println()

    println("---/ проверяем переполнение при добавлении с хвоста")
    qDS.enqueueOnTail(1)
    qDS.enqueueOnTail(2)
    qDS.enqueueOnTail(3)
    qDS.enqueueOnTail(4)
    qDS.enqueueOnTail(5)
    qDS.enqueueOnTail(6)
    qDS.enqueueOnTail(7)
    println()

    println("---/ проверяем опустошение при удалении с головы")
    repeat(7) {qDS.dequeueOnHead() }
    println()

    println("---/ проверяем переполнение при добавлении с головы")
    qDS.enqueueOnHead(1)
    qDS.enqueueOnHead(2)
    qDS.enqueueOnHead(3)
    qDS.enqueueOnHead(4)
    qDS.enqueueOnHead(5)
    qDS.enqueueOnHead(6)
    qDS.enqueueOnHead(7)
    println()

    println("---/ проверяем опустошение при удалении с хвоста")
    repeat(7) {qDS.dequeueOnTail() }

}