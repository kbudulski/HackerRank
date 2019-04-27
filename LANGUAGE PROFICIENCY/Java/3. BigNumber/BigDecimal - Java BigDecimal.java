import java.math.BigDecimal;
import java.util.*;

class Solution {
    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        //creating BigDecimal array to sort values
        List<String> list = new ArrayList<>(Arrays.asList(s));
        BigDecimal[] sorted = new BigDecimal[n];
        for (int i = 0; i < n; i++) {
            sorted[i] = new BigDecimal(s[i]);
        }
        Arrays.sort(sorted, Collections.reverseOrder());

        //comparing sorted values with list, deleting first occurences (in case there are duplicates)
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < list.size(); j++) {
                if (sorted[i].equals(new BigDecimal(list.get(j)))) {
                    s[i] = list.get(j);
                    list.remove(j);
                    break;
                }
            }
        }

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}