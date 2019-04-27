import java.util.*;

import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            /*
            regex structure:
            -opening tag and whatever is inside
            -second group makes sure there is no other tag inside the tags
            -closing tag with the same text inside as opening tag
            */
            Pattern p = Pattern.compile("<(.+)>([^<]+)<\\/\\1>");
            Matcher m = p.matcher(line);
            boolean flag = false;

            while(m.find()) {
                System.out.println(m.group(2));
                flag = true;
            }
            if (flag == false) System.out.println("None");

            testCases--;
        }
    }
}