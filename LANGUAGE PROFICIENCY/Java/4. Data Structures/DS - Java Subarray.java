import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int counter = 0;
        //checking all ranges for negative subarrays
        for (int i = 0; i < arr.length; i++) {
            int sum = 0, j = i;
            while (j < arr.length) {
                sum += arr[j];
                if (sum < 0) counter++;
                j++;
            }
        }
        System.out.println(counter);
    }
}