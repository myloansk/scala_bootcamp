object P46 {
    /*
    Define functions and, or, nand, nor, xor, impl, and equ (for logical equivalence) 
    which return true or false according to the result of their respective operations; e.g. and(A, B) 
    is true if and only if both A and B are true.
    */
    def and(a:Boolean, b:Boolean):Boolean ={
        return (a && b);
    }
    def or(a:Boolean, b:Boolean):Boolean = {
        return (a || b);
    }
    def nand(a:Boolean, b:Boolean):Boolean = {
        return !(a && b);
    }
    def nor(a:Boolean, b:Boolean):Boolean = {
        return !(a || b);
    }
    def xor(a:Boolean, b:Boolean):Boolean = {
        return (a ^ b);
    }
    def impl(b1: Boolean, b2: => Boolean): Boolean = if (b1) b2 else true
    def equ(b1: Boolean, b2: Boolean): Boolean = b1 == b2
    
	def main(args: Array[String]): Unit = {
	    val a = true; 
	    val b = false;

	    println("Logical Or of a || b = " + or(a, b));
	    println("Logical nand of !(a && b) = " + nand(a, b));
	    println("Logical xor of !(a ?? b) = " + nor(a, b));
	    println("Logical xor of (a ^ b) = " + xor(a, b));
	}
}