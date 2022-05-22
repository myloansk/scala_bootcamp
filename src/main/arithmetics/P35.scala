package arithmetic
import scala.annotation.tailrec  
object P35 {

    //Determine the prime factors of a given positive integer.  
    def factorize(x: Int): List[Int] = {
        @tailrec
        def foo(x: Int, a: Int = 2, list: List[Int] = Nil): List[Int] = a*a > x match {
        case false if x % a == 0 => foo(x / a, a    , a :: list)
        case false               => foo(x    , a + 1, list)
        case true                => x :: list
    }
    foo(x)
    }
}
