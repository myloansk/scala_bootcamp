package arithmetic
import scala.annotation.tailrec  
object P39 {

    /*
    Given a range of integers by its lower and upper limit,
    construct a list of all prime numbers in that range.
    */
    implicit class Sieve(val N: Int) extends AnyVal {
    def primesUpTo() = {
        val isPrime = collection.mutable.BitSet(2 to N: _*) -- (4 to N by 2)
        for (p <- 2 +: (3 to Math.sqrt(N).toInt by 2) if isPrime(p)) {
            isPrime --= p*p to N by p
        }
        isPrime.toImmutable
        }
    }
}
