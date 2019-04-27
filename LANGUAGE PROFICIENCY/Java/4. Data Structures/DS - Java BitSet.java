import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(N);
        BitSet[] bitset = new BitSet[3];

        bitset[1] = b1;
        bitset[2] = b2;

        for (int i = 0; i < M; i++) {
            String option = scan.next();
            int x = scan.nextInt();
            int y = scan.nextInt();
            switch (option) {
                case "AND":
                    bitset[x].and(bitset[y]);
                    break;
                case "OR":
                    bitset[x].or(bitset[y]);
                    break;
                case "XOR":
                    bitset[x].xor(bitset[y]);
                    break;
                case "FLIP":
                    bitset[x].flip(y);
                    break;
                case "SET":
                    bitset[x].set(y);
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}