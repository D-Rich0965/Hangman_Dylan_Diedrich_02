import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; 
import java.io.FileWriter;
import java.io.IOException;
public class Hangman {
	
private int win;

private int losses;

private String currentWord;

private String guess;

char letter;

HangmanDictionary myDictionary = new HangmanDictionary("HangmanDictionary.txt");
private void loadWL() {
	

Scanner sc;
try {
	sc = new Scanner(new File("WinLoss.txt"));
	win = sc.nextInt();
	losses = sc.nextInt();
} catch (FileNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
private void writeWL() {
	try {
		FileWriter fileWriter=new
				FileWriter("WinLoss.txt");
		fileWriter.write(win + " " + losses);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public Hangman(){
	loadWL();
}	
public void playGame(){ 
	Scanner sc = new Scanner(System.in);
	System.out.println("Would you like to play hangman Y/N?");
	sc.nextLine();
	int numGuesses = 5;
	currentWord=myDictionary.chooseWord().toUpperCase();
	char[] word=currentWord.toCharArray();
	List<Character> guessedLetters=new ArrayList<Character>();
	boolean looping = true;
		while (looping) {
			for (char c: word) {
				System.out.print(" _ ");
			}
			System.out.println("You have " + numGuesses + " incorrect guesses left.");
			for(int i=0; i<word.length;i++) {
				if(!guessedLetters.contains(word[i])) {
			}
				  
		
}
looping = false;}
		System.out.println("What is your Guess?");
		sc.nextLine();
	guess = sc.nextLine();
	 boolean guess = false; 
	    if (guess == true) { 
	                currentWord = currentWord.replaceAll("_ ", "_"); 
		Scanner sc1 = new Scanner(System.in);
      }
}
}

