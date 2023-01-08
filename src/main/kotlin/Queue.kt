class Queue(private val size: Int) {
    private var queue = arrayOfNulls<Int>(size)
    private var headIndex: Int = 0
    private var tailIndex: Int = 1

    fun enqueue(el: Int) {
        if (queue[headIndex] == null) {
            queue[headIndex] = el
            println("Содержимое очереди после добавления - ${queue.joinToString()}")
            return
        }
        if (queue[tailIndex] != null) {
            println("Вся очередь заполнена")
            return
        }
        queue[tailIndex] = el
        if (tailIndex + 1 == size) {
            tailIndex = 0
        } else tailIndex++

        println("Содержимое очереди после добавления - ${queue.joinToString()}")
        return
    }

    fun dequeue() {
        if (queue[headIndex] == null) {
            println("Очередь пуста")
            return
        }
        queue[headIndex] = null

        if (headIndex + 1 == size && queue[0] != null) {
            headIndex = 0
            println("Содержимое очереди после удаления  - ${queue.joinToString()}")
            return
        }

        if (queue[headIndex+1] != null) headIndex++
        println("Содержимое очереди после удаления - ${queue.joinToString()}")
        return
    }
}