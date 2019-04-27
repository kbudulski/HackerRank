import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(scan.nextInt());
        }
        int Q = scan.nextInt();
        for (int i = 0; i < Q; i++) {
            String s = scan.next();
            if (s.equals("Insert")) {
                list.add(scan.nextInt(), scan.nextInt());
            } else if (s.equals("Delete")) {
                list.remove(scan.nextInt());
            }
        }
        scan.close();

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}