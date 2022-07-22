fun factorial(n: Int): Int {
    fun factorial(n: Int, acc: Int): Int {
        return if (n == 0) acc else factorial(n - 1, n * acc)
    }
    return factorial(n, 1)
}

fun main(args: Array<String>) {
    println(factorial(5))
}