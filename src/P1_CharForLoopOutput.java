/*
	ISYS 320
	Name(s):Brian Williams
	Date: 4/8/2018
*/

/*
 Your expected results after the input is provided:
 
 1. efg
 2. nopqrs
 3. nothing / exception
 4. qr
 
 All were correct, however I did expect #3 to produce an exception.
  
 */
public class P1_CharForLoopOutput {

	public static void main(String[] args) {
		// put your call to printRange below here
		printRange('q', 'r');
	}
	
	public static void printRange(char startLetter, char endLetter ) {
		for( char letter = startLetter; letter <= endLetter; letter++ ) {
			System.out.print( letter );
		}
		
		System.out.println();
	}

}
