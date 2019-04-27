import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(x / y);
        } catch (InputMismatchException ex) {
            //getClass to pass weird Test case 4
            System.out.println(ex.getClass().getName());
        } catch (ArithmeticException ex) {
            System.out.println(ex);
        }
    }
}