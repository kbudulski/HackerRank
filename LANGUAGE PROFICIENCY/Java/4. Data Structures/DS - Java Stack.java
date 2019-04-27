import java.util.*;

class Solution {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            System.out.println(check(input));
        }
    }

    static boolean check(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('(') || s.charAt(i) == ('{') || s.charAt(i) == ('[')) stack.push(s.charAt(i));
            else if (!stack.isEmpty()) {
                if (stack.peek() == ('(') && s.charAt(i) == (')')) stack.pop();
                else if (stack.peek() == ('{') && s.charAt(i) == ('}')) stack.pop();
                else if (stack.peek() == ('[') && s.charAt(i) == (']')) stack.pop();
            } else return false;
        }
        return stack.isEmpty();
    }
}