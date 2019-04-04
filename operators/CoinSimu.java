//: operators/CoinSimu.java
import java.util.*;
import static net.mindview.util.Print.*;

public class CoinSimu {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(2);
        print(i + "Coin is at: " + (i == 0 ? "face" : "word"));
    }
}
