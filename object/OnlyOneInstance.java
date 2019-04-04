//: object OnlyOneInstance
/** OnlyOneInstance
 * Demonstrate there is only one instance of a static field
 * over multiple class instances.
 * @author Yu Zhao
 * @author www.joudou.com
 * @version 0.1
*/

public class OnlyOneInstance {

    static void increment() { StaticTest.i++; }
    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        StaticTest st1 = new StaticTest();
        StaticTest st2 = new StaticTest();
        StaticTest st3 = new StaticTest();
        StaticTest st4 = new StaticTest();
        OnlyOneInstance ooi = new OnlyOneInstance();
        ooi.increment();
        System.out.println(StaticTest.i);
        System.out.println(st1.i);
        System.out.println(st2.i);
        System.out.println(st3.i);
        System.out.println(st4.i);
    }
} /* Output:
48
48
48
48
48
*///:~
