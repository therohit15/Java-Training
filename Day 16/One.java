// UseCase
// The Indian cricket team had just wrapped up a thrilling overseas tour, and the team analyst was tasked with recording player performances. 
// Using any Collection , he stored batsmen’s names as  and the number of centuries they scored as values. Another was used for bowlers, where 
// the player’s name was the wickets taken were the value. This way, the entire team’s performance was neatly organized for quick reference.

// During the performance review, Rohit Sharma’s record was updated after he scored an extra century in the final match. Meanwhile, veteran bowler 
// Mohammed Shami announced his retirement, leading to his removal from the bowlers’ collection concept. With all changes made, the analyst printed 
// the updated stats, proudly showcasing the top batsmen and wicket-takers of the tour. The Collection made the job quick, easy, and perfectly structured.

// Constraints:
// 1.Number of batsmen or bowlers entries (n) must be between 1 and 20.
// 2.Player names must be unique (no duplicate keys allowed in the HashMap).
// 3.Centuries and wickets must be non-negative integers (0 or more).
// 4.At least one batsman and one bowler must be entered.
// 5.If an update is made to a player not in the HashMap, display "Player not found".
// 6.If a removal is attempted for a player not in the HashMap, display "Player does not exist".


// Input Format
// First line: Integer n — number of batsmen entries.
// Next n lines: <Batsman_Name> <Centuries>
// Next line: Integer m — number of bowlers entries.
// Next m lines: <Bowler_Name> <Wickets>
// One line: Update <Batsman_Name> <Extra_Centuries> (to add to an existing batsman’s centuries)
// One line: Remove <Bowler_Name> (to remove a bowler from the records)

// Output Format
// Print "Batsmen and their Centuries:" followed by each batsman’s name and centuries in separate lines.
// Print "Bowlers and their Wickets:" followed by each bowler’s name and wickets in separate lines.
// Print "After Update and Removal:" followed by updated batsmen and bowlers lists.

// Test Case 1
// Input
// 3
// Virat 3
// Rohit 2
// Gill 1
// 3
// Bumrah 12
// Shami 10
// Jadeja 8
// Update Rohit 1
// Remove Shami

// Output
// Batsmen and their Centuries:
// Virat -> 3
// Rohit -> 2
// Gill -> 1

// Bowlers and their Wickets:
// Bumrah -> 12
// Shami -> 10
// Jadeja -> 8

// After Update and Removal:

// Batsmen:
// Virat -> 3
// Rohit -> 3
// Gill -> 1

// Bowlers:
// Bumrah -> 12
// Jadeja -> 8

// Test Case 2
// Input
// 2
// Dhoni 1
// Raina 2
// 2
// Zaheer 7
// Ishant 5
// Update Raina 2
// Remove Ishant

// Output
// Batsmen and their Centuries:
// Dhoni -> 1
// Raina -> 2

// Bowlers and their Wickets:
// Zaheer -> 7
// Ishant -> 5

// After Update and Removal:

// Batsmen:
// Dhoni -> 1
// Raina -> 4

// Bowlers:
// Zaheer -> 7




// Test Case 4 
// Input
// 2
// Virat -1
// Rohit 3
// 2
// Bumrah 10
// Shami 5
// Update Rohit 1
// Remove Shami

// Output
// Invalid input: Centuries or wickets cannot be negative.

// Test Case 5 
// Input
// 2
// Virat 2
// Rohit 3
// 2
// Bumrah 10
// Shami 5
// Update Rohit 1
// Remove Jadeja

// Output
// Player does not exist.



import java.util.*;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n < 1 || n > 20) {
            System.out.println("Invalid input: Number of entries must be between 1 and 20.");
            sc.close();
            return;
        }

        Map<String, Integer> batsmen = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int centuries = sc.nextInt();

            if (centuries < 0) {
                System.out.println("Invalid input: Centuries or wickets cannot be negative.");
                sc.close();
                return;
            }
            if (batsmen.containsKey(name)) {
                System.out.println("Invalid input: Duplicate player names are not allowed.");
                sc.close();
                return;
            }
            batsmen.put(name, centuries);
        }

        int m = sc.nextInt();
        if (m < 1 || m > 20) {
            System.out.println("Invalid input: Number of entries must be between 1 and 20.");
            sc.close();
            return;
        }

        Map<String, Integer> bowlers = new LinkedHashMap<>();
        for (int i = 0; i < m; i++) {
            String name = sc.next();
            int wickets = sc.nextInt();

            if (wickets < 0) {
                System.out.println("Invalid input: Centuries or wickets cannot be negative.");
                sc.close();
                return;
            }
            if (bowlers.containsKey(name)) {
                System.out.println("Invalid input: Duplicate player names are not allowed.");
                sc.close();
                return;
            }
            bowlers.put(name, wickets);
        }

        System.out.print("Update ");
        String updateName = sc.next();
        int extraCenturies = sc.nextInt();

        if (!batsmen.containsKey(updateName)) {
            System.out.println("Player not found");
            sc.close();
            return;
        } else {
            batsmen.put(updateName, batsmen.get(updateName) + extraCenturies);
        }

        System.out.print("Remove ");
        String removeName = sc.next();

        if (!bowlers.containsKey(removeName)) {
            System.out.println("Player does not exist.");
            sc.close();
            return;
        } else {
            bowlers.remove(removeName);
        }

        System.out.println("Batsmen and their Centuries:");
        for (Map.Entry<String, Integer> entry : batsmen.entrySet()) {
            System.out.println(entry.getKey() + " -> " + (updateName.equals(entry.getKey()) ? entry.getValue() - extraCenturies : entry.getValue()));
        }
        System.out.println();
        System.out.println("Bowlers and their Wickets:");
        for (Map.Entry<String, Integer> entry : bowlers.entrySet()) {
            if (!entry.getKey().equals(removeName)) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }

        System.out.println("\nAfter Update and Removal:\n");
        System.out.println("Batsmen:");
        for (Map.Entry<String, Integer> entry : batsmen.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println();
        System.out.println("Bowlers:");
        for (Map.Entry<String, Integer> entry : bowlers.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        sc.close();
    }
}