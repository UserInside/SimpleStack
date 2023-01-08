import kotlin.math.abs

class QueueDoubleSided(private val size: Int) {
    private var queue = arrayOfNulls<Int>(size)
    private var headIndex: Int = 0
    private var tailIndex: Int = 0

    fun enqueueOnTail(el: Int) {
        if (queue[headIndex] == null) {
            queue[headIndex] = el
//            println("Содержимое очереди после добавления с хвоста- ${queue.filterNotNull().joinToString()}")
            println(this.toString())
            return
        }
        when (tailIndex) {
            queue.lastIndex -> {
                if (queue.first() == null) {
                    tailIndex = 0
                } else {
                    println("Добавление элемента с хвоста не доступно. Вся очередь заполнена.")
                    return
                }

            }

            else -> {
                if (queue[tailIndex + 1] == null) {
                    tailIndex++
                } else {
                    println("Добавление элемента с хвоста не доступно. Вся очередь заполнена.")
                    return
                }
            }
        }

        queue[tailIndex] = el
//        println("Содержимое очереди после добавления с хвоста- ${queue.filterNotNull().joinToString()} ")
        println(this.toString())
        return
    }

    fun dequeueOnHead(): Int? {
        if (queue[headIndex] == null) {
            println("Очередь пуста")
            return null
        }
        val res = queue[headIndex]

        queue[headIndex] = null

        when (headIndex) {
            queue.lastIndex -> if (queue[0] != null) headIndex = 0
            else -> if (queue[headIndex + 1] != null) headIndex++
        }

//        println("Содержимое очереди после удаления с головы - ${queue.filterNotNull().joinToString()}")
        println(this.toString())
        return res
    }

    fun enqueueOnHead(el: Int) {
        if (queue[tailIndex] == null) {
            queue[tailIndex] = el
//            println("Содержимое очереди после добавления с хвоста- ${queue.filterNotNull().joinToString()}")
            println(this.toString())
            return
        }
        when (headIndex) {
            0 -> {
                if (queue.last() == null) {
                    headIndex = queue.lastIndex
                } else {
                    println("Добавление элемента с головы не доступно. Вся очередь заполнена.")
                    return
                }

            }

            else -> {
                if (queue[headIndex - 1] == null) {
                    headIndex--
                } else {
                    println("Добавление элемента с головы не доступно. Вся очередь заполнена.")
                    return
                }
            }
        }

        queue[headIndex] = el

//        println("Содержимое очереди после добавления с головы - ${queue.filterNotNull().joinToString()} (head - ${queue[headIndex]}, tail - ${queue[tailIndex]})")
        println(this.toString())
        return
    }

    fun dequeueOnTail(): Int? {
        if (queue[tailIndex] == null) {
            println("Очередь пуста")
            return null
        }

        val res = queue[tailIndex]

        queue[tailIndex] = null

        when (tailIndex) {
            0 -> if (queue.last() != null) tailIndex = queue.lastIndex
            else -> if (queue[tailIndex - 1] != null) tailIndex--
        }

//        println("Содержимое очереди после удаления с хвоста - ${queue.filterNotNull().joinToString()}")
        println(this.toString())
        return res
    }

    override fun toString(): String {
        if (headIndex == tailIndex) return "Содержимое очереди - ${queue[headIndex] ?: "Очередь пуста"} "

        val cleanSize =
            if (tailIndex > headIndex) (tailIndex - headIndex + 1) else size - (headIndex - tailIndex - 1)

        val cleanQueue = arrayOfNulls<Int>(cleanSize)

        if (tailIndex > headIndex) {
            for (i in cleanQueue.indices) {
                cleanQueue[i] = this.queue[headIndex + i]
            }
        } else {
            for (i in cleanQueue.indices) {
                cleanQueue[i] = if (headIndex + i < size) this.queue[headIndex + i] else this.queue[headIndex + i - size]
                }
            }

        return "Содержимое очереди - ${cleanQueue.filterNotNull().joinToString()} "

    }
}

//(head - ${queue[headIndex]}, tail - ${queue[tailIndex]})