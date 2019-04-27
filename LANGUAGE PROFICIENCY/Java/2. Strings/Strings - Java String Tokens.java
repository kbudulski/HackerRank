import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if (s.trim().equals("")) System.out.println("0");
        else if (s.length() >= 1 && s.length() <= 400000) {
            //splitting the String with the use of regex
            String[] arr = s.trim().split("[ !,?._'@]+");
            System.out.println(arr.length);
            for (String x : arr) System.out.println(x);
        }
        scan.close();
    }
}