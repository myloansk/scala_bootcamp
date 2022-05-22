case class LigicalOp(a:Boolean) {
    def apply(op:String)(b:Boolean):Boolean = {
        op match {
            case "and" => (a && b);
            case "or" => (a || b);
            case "nand" => !(a && b);
            case "nor" => !(a || b);
            case "xor" => (a ^ b);
            }
        }
    }

object ConvertsNumOp{
        implicit def convert(a:Boolean):LigicalOp= LigicalOp(a)
}

object P46 {
    /*
    Continue problem P46 by redefining and, or, etc as operators.
    (i.e. make them methods of a new class with an implicit conversion from Boolean.)
    not will have to be left as a object method.
    */
    def main(args: Array[String]): Unit = {
        val a = LigicalOp(true); 
        val b = false;
    
        val c = a ("and")(b);
        println(c);
        val d = a ("or")(b);
        println(d);