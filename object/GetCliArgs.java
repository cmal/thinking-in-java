//: object GetCliArgs
/** GetCliArgs
 * Print the first 3 command line args.
 * @author Yu Zhao
 * @author www.joudou.com
 * @version 0.1
*/

import java.lang.*;

public class GetCliArgs {

    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);

    }
} /* Call: java GetCli Args first second third fourth
Output:
first
second
third
*///:~
