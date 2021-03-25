import java.util.Random;
import java.security.SecureRandom;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class HangmanDictionary {
private String[] wordList=new String[200];
private int currentCard;
SecureRandom randomNumbers = new SecureRandom();

private void readFile(String fileName){
	Scanner sc;
	try {
		sc = new Scanner(new File(fileName));
		 for(int i=0; i<wordList.length; i++) {
			  wordList[i]=sc.next();
		  }
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
  }
public String chooseWord(){
	
	return wordList[randomNumbers.nextInt(200)]; 
}

public HangmanDictionary(String fileName){
	readFile(fileName);

}
}
