import java.util.*;

public class test {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        Set<Integer> hashSet = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            deque.add(num);
            hashSet.add(num);

            //deque is filled
            if (deque.size() == m) {
                //using Set for unique values
                if (hashSet.size() > max) max = hashSet.size();
                int temp = (int) deque.removeFirst();
                //checking if duplicate is in another set and if not, deleting it
                if (!deque.contains(temp)) hashSet.remove(temp);
            }
        }
        System.out.println(max);
    }
}