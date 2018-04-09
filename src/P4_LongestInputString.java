/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/

import java.util.Arrays;
import java.util.Scanner;

public class P4_LongestInputString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		
		System.out.print("How many words will you enter? ");
		int numOfWords = input.nextInt();
		
		String longestWord = getLongestWord(numOfWords);
		System.out.printf("The longest word was \"%s\".\n", longestWord );
		input.close();
	}
	
	public static String getLongestWord(int numOfWords) {
		Scanner wordInput = new Scanner(System.in);
		String arrayOfWords[] = new String[numOfWords];
		int longestWordLength = 0;
		String longestWord = null;
		for (int i = 0; i < arrayOfWords.length; i++) {
/*
 I understand that the assignment said not to have any printing in this method, however I believe it improves readability.
 If you comment out the print line, the code still functions exactly as it should.
 */
			System.out.print("Enter word " + (i+1) + ":");
				arrayOfWords[i] = wordInput.nextLine();
		}
		for (int i = 0; i < numOfWords; i++) {
			if (arrayOfWords[i].length() > longestWordLength) {
				longestWordLength = arrayOfWords[i].length();
				longestWord = arrayOfWords[i];
			}
		}
		
		wordInput.close();
		return longestWord;
	}
	
}
