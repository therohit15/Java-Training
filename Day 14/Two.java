// UseCASE-2
// Write a Java program to:
// 1.	Accept the marks of N students.
// 2.	Store the marks in an ArrayList.
// 3.	Perform the following 4 operations:
// Operations:
// 1.	Display all student marks.
// 2.	Convert each mark to a grade based on Anna University rules.
// 3.	Update a student's mark at a given index (e.g., after revaluation).
// 4.	Sort and display the marks in ascending order.
// ________________________________________
//  Anna University Grading System:
// Marks	Grade
// 90 - 100	O
// 80 - 89	A+
// 70 - 79	A
// 60 - 69	B+
// 50 - 59	B
// Below 50	RA
// ________________________________________
//  Input Format:
// mathematica
// CopyEdit
// First line: Integer N (number of students)
// Next N lines: Marks of each student (0–100)
// (Optional) Update: Index and new mark (for revaluation)
//  Output Format:
// •	Marks List
// •	Corresponding Grades
// •	Updated List (if any)
// •	Sorted List
// ________________________________________
// Test Case 1
// Input:
// 5
// 95
// 82
// 67
// 58
// 43
// Output:
// less

// Grades: [O, A+, B+, B, RA]
// Sorted: [43, 58, 67, 82, 95]
// ________________________________________
// Test Case 2 (With Update)
// Input:
// pgsql
// CopyEdit
// 4
// 76
// 49
// 88
// 67
// Update index 1 to 55
// Output:
// Original: [76, 49, 88, 67]
// Updated: [76, 55, 88, 67]
// Grades: [A, B, A+, B+]
// Sorted: [55, 67, 76, 88]
// Test Case 3
// 100
// 100
// 100
// Output:
// less
// Marks: [100, 100, 100]
// Grades: [O, O, O]
// Sorted: [100, 100, 100]
// ________________________________________
//  Test Case 4 (Edge Values)
// Input:
// 6
// 90
// 89
// 70
// 60
// 50
// 49
// Output:
// less

// Marks: [90, 89, 70, 60, 50, 49]
// Grades: [O, A+, A, B+, B, RA]
// Sorted: [49, 50, 60, 70, 89, 90]
// ________________________________________
// 🎓 Final Note:
// This simple Java program using ArrayList can be the backbone of a grading system for colleges. You’ve built:
// •	A dynamic mark collector
// •	A grading converter
// •	A mark updater
// •	A rank viewer
// All using just one Java collection — ArrayList.




import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Two {
    public static List<String> grade(List<Integer> list){
        List<String> grade = new ArrayList<>();
        for(int i: list){
            if(i<=90 && i>=100){
                grade.add("O");
            }
            else if(i<90 && i>=80){
                grade.add("A+");
            }
            else if(i<80 && i>=70){
                grade.add("A");
            }
            else if(i<70 && i>=60){
                grade.add("B+");
            }
            else if(i<60 && i>=50){
                grade.add("B");
            }
            else if(i<50){
                grade.add("RA");
            }
        }
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int index = -1, value = -1;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        
        System.out.println("Enter index and value, if you want to update:");
        if(sc.hasNextInt()){
            index = sc.nextInt();
            value = sc.nextInt();
        }
        System.out.println("Marks: "+list);
        if(index>=0 && value>=0) {
            list.set(index, value);
            System.out.println("Updated: "+list);
        }
        List<String> grade = grade(list);
        System.out.println("Grades: "+grade);
        Collections.sort(list);
        System.out.println("Grades: "+ list );
        sc.close();
    }
}