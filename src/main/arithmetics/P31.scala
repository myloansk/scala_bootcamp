package arithmetic

object P31 {

    //Determine whether a given integer number is
    def isPrime2(i :Int) : Boolean = {
        if (i <= 1)
            false
        else if (i == 2)
            true
        else
            !(2 to (i-1)).exists(x => i % x == 0)}
}
