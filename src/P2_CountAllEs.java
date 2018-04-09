import java.util.Scanner;

/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/

/* 2. Your pseudocode algorithm in here
 
 	- Scanner that allows user to input a string
 	- Int that counts the number of e in the string
 	- Print the int to console.
 
 
 
 
 */


public class P2_CountAllEs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in );
		String phrase = input.nextLine();
		int count = phrase.length() - phrase.replaceAll("[eE]", "").length();
		System.out.print("There were " + count + " e's.");
		input.close();
	}

}
