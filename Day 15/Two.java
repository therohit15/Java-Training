// USECASE
// At Greenwood University, the Dean is preparing the official Merit List for the Annual Academic Awards Ceremony.
// Every year, hundreds of students apply, but the Dean only considers unique scores and always displays them in ascending order so that top performers shine at the top.
// The Dean’s assistant, Rahul, is tasked with managing the scores. He uses a magical register (in our case, a TreeSet) that automatically removes duplicates, keeps scores 
// sorted, and finds ranks instantly.
// One day, a student withdraws, and Rahul must remove their score. Another student calls to check whether their score appears in the merit list. The Dean then asks Rahul 
// to find the highest and lowest scores, and also see which score is just above and below a specific student’s score. Finally, the Dean wants to display only those scores 
// that fall within a given range before clearing the register for the next year.

// Your task is to help Rahul manage the list using a TreeSet and perform all these operations efficiently.

// Input Format
// n → number of scores
// a1 a2 ... an → the scores (may contain duplicates)
// removeScore → score to be removed from the TreeSet
// checkScore → score to check if present
// specificScore → score used for lower() and higher() operations
// rangeStart rangeEnd → start and end values for subset() operation (inclusive)

// Output Format
// Initial Merit List: <TreeSet after adding scores>
// After Removing <removeScore>: <TreeSet after removal>
// Is <checkScore> present? <true/false>
// Lowest Score: <value>
// Highest Score: <value>
// Score just below <specificScore>: <value or null>
// Score just above <specificScore>: <value or null>
// Scores in range <rangeStart> to <rangeEnd>: <subset TreeSet>
// Final Merit List after clearing: []


// Test Case 1
// Input:
// 7
// 85 92 76 85 90 88 95
// 88
// 90
// 92
// 85 92

// Output:
// Initial Merit List: [76, 85, 88, 90, 92, 95]
// After Removing 88: [76, 85, 90, 92, 95]
// Is 90 present? true
// Lowest Score: 76
// Highest Score: 95
// Score just below 92: 90
// Score just above 92: 95
// Scores in range 85 to 92: [85, 90, 92]
// Final Merit List after clearing: []

// Test Case 2
// Input:
// 5
// 50 75 60 75 80
// 75
// 100
// 75
// 60 80

// Output:
// Initial Merit List: [50, 60, 75, 80]
// After Removing 75: [50, 60, 80]
// Is 100 present? false
// Lowest Score: 50
// Highest Score: 80
// Score just below 75: 60
// Score just above 75: 80
// Scores in range 60 to 80: [60, 80]
// Final Merit List after clearing: []

// Test Case 3
// Input:
// 6
// 45 55 65 75 85 95
// 45
// 55
// 75
// 50 90

// Output:
// Initial Merit List: [45, 55, 65, 75, 85, 95]
// After Removing 45: [55, 65, 75, 85, 95]
// Is 55 present? true
// Lowest Score: 55
// Highest Score: 95
// Score just below 75: 65
// Score just above 75: 85
// Scores in range 50 to 90: [55, 65, 75, 85]
// Final Merit List after clearing: []




import java.util.Scanner;
import java.util.TreeSet;

public class Two {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();
        int no = sc.nextInt();
        for (int i = 0; i < no; i++) {
            set.add(sc.nextInt());
        }
        System.out.println("Initial Merit List: "+set);
        int rem = sc.nextInt();
        set.remove(rem);
        System.out.println("After removing "+rem+": "+set);
        int search = sc.nextInt();
        System.out.println("Is "+search+" present?"+set.contains(search));
        System.out.println("Lowest score: "+set.last());
        System.out.println("Lowest score: "+set.first());
        int num = sc.nextInt();
        System.out.println("Score just below: "+set.lower(num));
        System.out.println("Score just above: "+set.higher(num));
        int start = sc.nextInt();
        int end = sc.nextInt();
        System.out.println("Scores in range "+start+" to "+end+": "+set.subSet(start, true, end, true));
        set.removeAll(set);
        System.out.println("Final Merit List after clearing: "+set);
        sc.close();
    }
}