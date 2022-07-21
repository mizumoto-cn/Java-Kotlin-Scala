// just a line of comment
import scala.compiletime.ops.int
/* ... */
/** documentation comment */
object Singleton { // singleton object, declaring a struct and its unique instance
    def abs(n : int) : int = // function definition: receives an int and returns an int
        if (n < 0) -n 
        else n

    private def formatAbs(x: int) = { // private function can only be called from within the object
        val msg = "The absolute value of %d is %d"
        msg.format(x, abs(x))
    }

    def main(args: Array[String]): Unit = { // main function, entry point of the program
        println(formatAbs(-42))
    }

}