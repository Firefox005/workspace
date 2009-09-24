/**
 * 
 */
package towersofhanoi;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

/**
 * @author sam
 *
 */
public class TowersofHanoi {
	
	static int moves = 0;
	static int totalDisks = 0;
	
	public static void main(String[] args) throws java.io.IOException {
		int disks;
		char fromPole;
		char withPole;
		char toPole;
		disks = getNumber("\nHow many disks are there on the tower? ");
		totalDisks = disks;
		
		if (totalDisks > 10) {
			System.out.println("Working ... ");
		}
		FileOutputStream fos = new FileOutputStream("TowersofHanoiSolution.txt");
		PrintStream ps = new PrintStream(fos);
		solveHanoi(disks, fromPole, toPole, withPole, ps);
		ps.close();
		System.out.println();
		System.out.println("\nAmount of moves: " + moves + "\n");
		System.out.println("You can now access the TowersofHanoiSolution.txt file");
		
	}
	
	static void solveHanoi (int disks, char fromPole, char toPole, char withPole, PrintStream ps) {
		if (disks >= 1) {
			solveHanoi(disks-1, fromPole, withPole, toPole, ps);
			moveDisk(fromPole, toPole, ps);
			solveHanoi(disks-1, withPole, toPole, fromPole, ps);
		}
	}
	
	static void moveDisk(char fromPole, char toPole, PrintStream ps) {
		moves++;
		if (totalDisks <= 10) {
			System.out.println("Move from " + fromPole + " to " + toPole + ". ");
			ps.print("Move from " + fromPole + " to " + toPole + ". ");
			if (moves%4 == 0) {
				System.out.println();
				ps.println();
			}
		}
		else {
			ps.print("Move from " + fromPole + " to " + toPole + ". ");
			if (moves%4 == 0) {
				ps.println();
			}
		}
	}
	
	static int getNumber (String question) throws java.io.IOException {
		String theNumber;
		int number = 0;
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println(question);
		theNumber = in.readLine();
		System.out.println();
		number = Integer.parseInt(theNumber);
		return number;
	}

}
