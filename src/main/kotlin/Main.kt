import java.io.IOException

fun main() {
    val stack = Stack()
    stack.add(4)
    stack.add(1)
    stack.add(3)
    stack.remove()
    stack.add(8)
    stack.remove()

}

class Stack {
    private var stack = arrayOfNulls<Int>(0)

    fun add(addition: Int): Array<Int?> {
        val stack = arrayOfNulls<Int>(size = this.stack.size + 1)
        if (stack.size == 1) {
            stack[stack.lastIndex] = addition
            this.stack = stack
            println("Содержимое стека - ${this.stack.joinToString()}")
            return stack
        }

        for (i in 0 until stack.size - 1) {
            stack[i] = this.stack[i]
        }
        stack[stack.lastIndex] = addition
        this.stack = stack
        println("Содержимое стека - ${this.stack.joinToString()}")
        return stack
    }

    fun remove(): Array<Int?> {
        if (this.stack.isEmpty()) throw IOException("Stack is already empty")
        val stack = arrayOfNulls<Int>(size = this.stack.size - 1)
        for (i in stack.indices) {
            stack[i] = this.stack[i]
        }
        this.stack = stack
        return if (this.stack.isNotEmpty()) {
            println("Содержимое стека - ${this.stack.joinToString()}")
            stack
        } else {
            println("Стек пуст")
            stack
        }
    }
}