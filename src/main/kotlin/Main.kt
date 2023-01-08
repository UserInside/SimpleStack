
fun main() {
    val stack = Stack()
    stack.push(4)
    stack.push(1)
    stack.push(3)
    stack.pop()
    stack.push(8)
    stack.pop()

    println()

    val queue = Queue(6)
    queue.enqueue(4)
    queue.enqueue(1)
    queue.enqueue(3)
    queue.dequeue()
    queue.enqueue(8)
    queue.dequeue()
    queue.enqueue(1)
    queue.enqueue(7)
    queue.enqueue(2)
    queue.dequeue()
    queue.dequeue()
    queue.enqueue(4)
    queue.enqueue(8)
    queue.enqueue(5)
    queue.enqueue(77)
    repeat(7) { queue.dequeue() }



}