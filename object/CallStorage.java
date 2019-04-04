//: object CallStorage
/** CallStorage
 * Print result of calling storage()
 * @author Yu Zhao
 * @author www.joudou.com
 * @version 0.1
*/
public class CallStorage {

    int storage(String s) {
        return s.length() * 2;
    }

    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {
        String s = new String("dkafjkdsfjakfdj");
        CallStorage cs = new CallStorage();
        System.out.println(cs.storage(s));
    }
} /* Output:
*///:~
