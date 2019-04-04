//: object Incrementable
/** Incrementable
 * Print result after calling increment
 * @author Yu Zhao
 * @author www.joudou.com
 * @version 0.1
*/

public class Incrementable {

    static void increment() { StaticTest.i++; }
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        Incrementable.increment();
        Incrementable sf = new Incrementable();
        sf.increment();
        System.out.println(StaticTest.i);
    }
} /* Output:
*///:~
