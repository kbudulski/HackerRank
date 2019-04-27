import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //ArrayList for another ArrayLists
        List<ArrayList<Integer>> generalList = new ArrayList<>();
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            ArrayList<Integer> al = new ArrayList<>();
            int d = scan.nextInt();
            for (int j = 0; j < d; j++) {
                al.add(scan.nextInt());
            }
            generalList.add(al);
        }
        int q = scan.nextInt();
        for (int i = 0; i < q; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            ArrayList<Integer> search = generalList.get(x - 1);
            //checking if out of range
            if (search.size() < y) System.out.println("ERROR!");
            else System.out.println(search.get(y - 1));
        }
        scan.close();
    }
}