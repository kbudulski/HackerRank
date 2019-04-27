import java.util.*;
import java.math.BigInteger;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());

        System.out.printf("%d\n%d", a.add(b), a.multiply(b));
    }
}