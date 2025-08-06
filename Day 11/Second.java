// Q2)
// In the certain area there was a camp of polio drops team. They need to search every baby in 
// the particular area. They want to find the baby and take out the baby for polio drops. Help 
// them to find the baby to avoid polio attacks. (remove the occurrence of “the” word from 
// entered string). [Hint: To get a whole sentence use the following statement: scanf("%[^\n]",a);]
// Input Format:
// Input consists of a string.
// Output Format:
// remove "the" occurrence of the word from entered string.
// Sample Input:
// the height of Mt.Everest is 8448 m.
// Sample Output:
// height of Mt.Everest is 8448 m.
// Input (stdin)
// the height of Mt.Everest is 8448 m.
// Output (stdout)
// height of Mt.Everest is 8448 m.

import java.util.*;
public class Second {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str=str.replaceAll("the ", "");
        System.out.println(str);
        sc.close();
    }
}