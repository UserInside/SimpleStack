import java.io.IOException

class Stack {
    private var stack = arrayOfNulls<Int>(0)

    fun push(addition: Int): Array<Int?> {
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

    fun pop(): Array<Int?> {
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