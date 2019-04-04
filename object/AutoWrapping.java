//: object AutoWrapping
/** AutoWrapping
 * Demonstrate that java auto wrapping all fundamental classes.
 * @author Yu Zhao
 * @author www.joudou.com
 * @version 0.1
*/

import java.lang.*;

public class AutoWrapping {

    /** Entry point to class & application.
     * @param args array of string arguments
     * @throws exceptions No exceptions thrown
     */
    public static void main(String[] args) {

        System.out.println("==== boolean ====");
        boolean b1 = true;
        Boolean bl1 = new Boolean(b1);

        System.out.println(b1);
        System.out.println(bl1);

        Boolean bln2 = new Boolean(false);
        boolean bl2 = bln2;
        System.out.println(bln2);
        System.out.println(bl2);

        System.out.println("==== char ====");
        char c1 = 'x';
        Character ch1 = new Character(c1);
       
        System.out.println(c1);
        System.out.println(ch1);
        
        Character ch = new Character('y');
        char c = ch;

        System.out.println(ch);
        System.out.println(c);

        System.out.println("==== byte ====");
        byte bt1 = 7;
        Byte bte1 = new Byte(bt1);

        System.out.println(bt1);
        System.out.println(bte1);
        
        Byte bt2 = new Byte((byte)8);
        byte b2 = bt2;
        System.out.println(bt2);
        System.out.println(b2);

        System.out.println("==== short ====");
        short s1 = 1;
        Short st1 = new Short(s1);

        System.out.println(s1);
        System.out.println(st1);

        Short st2 = new Short((short)2);
        short s2 = st2;
        System.out.println(st2);
        System.out.println(s2);
        
        System.out.println("==== int ====");
        int i1 = 3;
        Integer it1 = new Integer(i1);
        System.out.println(i1);
        System.out.println(it1);

        Integer it2 = new Integer(4);
        int i2 = it2;
        System.out.println(it2);
        System.out.println(i2);

        System.out.println("==== long ====");
        long l1 = 2223333;
        Long lg1 = new Long(l1);
        System.out.println(l1);
        System.out.println(lg1);

        Long lg2 = new Long(3333222);
        long l2 = lg2;
        System.out.println(lg2);
        System.out.println(l2);
        
        System.out.println("==== float ====");
        float f1 = (float)234.204;
        Float ft1 = new Float(f1);
        System.out.println(f1);
        System.out.println(ft1);

        Float ft2 = new Float(432.432);
        float f2 = ft2;
        System.out.println(f2);
        System.out.println(ft2);

        System.out.println("==== double ====");
        double d1 = 21341234.21341234;
        Double db1 = new Double(d1);
        System.out.println(d1);
        System.out.println(db1);

        Double db2 = new Double(234137979.7072346340);
        double d2 = db2;
        System.out.println(db2);
        System.out.println(d2);

        // System.out.println("==== void ====");
        // void v1 = null;
        // Void vd1 = new Void(v1);
        // System.out.println(v1);
        // System.out.println(vd1);

        // Void vd2 = new Void();
        // void v2 = vd2;
        // System.out.println(v2);
        // System.out.println(vd2);

    }
} /* Output:
==== boolean ====
true
true
false
false
==== char ====
x
x
y
y
==== byte ====
7
7
8
8
==== short ====
1
1
2
2
==== int ====
3
3
4
4
==== long ====
2223333
2223333
3333222
3333222
==== float ====
234.204
234.204
432.432
432.432
==== double ====
2.134123421341234E7
2.134123421341234E7
2.3413797970723462E8
2.3413797970723462E8
*///:~
