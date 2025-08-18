// In a bustling game development company named GameCorp, the foundation of every title
//  begins with the Game class, which holds the basic features like the game’s name and 
// the ability to start it. The company’s AdventureDivision then extends this base, adding 
// exciting mechanics for exploring vast maps filled with mysteries. Finally, the specialized 
//TreasureHuntTeam takes over, building on the AdventureDivision’s work by hiding clues, 
// designing treasure puzzles, and placing secret chests throughout the world. As the lead 
// developer, your mission is to connect these three levels of development so the final game 
// flows seamlessly — first showing the title, then letting the player explore adventurous maps, 
// and finally allowing them to solve clues and unlock the treasure chest. The player’s journey 
// begins with a tap on “Start Game,” continues through thrilling map explorations, and ends with 
// the golden moment of victory when they open the treasure chest and see the words “You Win!” shining on the screen.

// Input Format
// Game Title (String)
// Number of maps to explore (int)
// Number of clues found (int)
// Required number of clues to unlock the treasure (int)

// Output Format
// Display the game title.
// Show “Game Started” message.
// Show maps explored.
// Show clues collected.
// If collected clues ≥ required clues → “Treasure Unlocked! You Win!”
// Otherwise → “Not enough clues! Try Again!”

// Test Case 1
// Input
// Treasure Quest
// 3
// 5
// 4

// Output
// Game: Treasure Quest
// Game Started...
// Exploring 3 adventurous maps...
// Collected 5 clues.
// Treasure Unlocked! You Win!

// Test Case 2
// Input
// Island Mystery
// 2
// 1
// 3

// Output
// Game: Island Mystery
// Game Started...
// Exploring 2 adventurous maps...
// Collected 1 clues.
// Not enough clues! Try Again!



import java.util.*;

class Game {
    static String name;
    static void start(){

    }
    
}

class Adventure extends Game {
    static void maps(){

    }
    
}

class TreasureHunt extends Adventure{
    
    
}

public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreasureHunt game = new TreasureHunt();
        System.out.println("Enter the game name: ");
        TreasureHunt.name = sc.nextLine();
        TreasureHunt.start();
        sc.close();
        
    }
}