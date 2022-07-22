// just a line of comment
import scala.compiletime.ops.int
/* ... */
/** documentation comment */
object Singleton // singleton object, declaring a struct and its unique instance
    def abs(n : int) : int = 
        if (n < 0) -n 
        else n

    // private function can only be called from within the object
    // function definition: receives an int and returns an int
    private def formatAbs(x: int) =  
        val msg = "The absolute value of %d is %d"
        msg.format(x, abs(x))
    

    // main function, entry point of the program
    @main def printAbs: Unit =
        println(formatAbs(-42))
