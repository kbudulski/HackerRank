import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder sb = new StringBuilder(A);

        System.out.print(A.equals(sb.reverse().toString()) ? "Yes" : "No");
    }
}