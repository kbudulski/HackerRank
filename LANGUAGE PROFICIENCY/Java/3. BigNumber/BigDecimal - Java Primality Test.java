import java.math.*;
import java.util.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        scanner.close();

        System.out.print(new BigInteger(n).isProbablePrime(1) ? "prime" : "not prime");
    }
}