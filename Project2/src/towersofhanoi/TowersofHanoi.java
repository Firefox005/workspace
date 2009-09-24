/**
 * 
 */
package towersofhanoi;

import java.io.*;

/**
 * @author sam
 *
 */
public class TowersofHanoi {
	
	static int moves = 0;
	static int totalDisks = 0;
	
	public static void main(String[] args) throws java.io.IOException {
		
		int disks;
		char fromPole = 'A';
		char withPole = 'B';
		char toPole = 'C';
		disks = getNumber("/nHow many diska are there on the tower? ");
		totalDisks = disks;
		
		if (totalDisks > 10) {
			System.out.println("Working...");
		}
		
		FileOutputStream fos = new FileOutputStream ("TowersofHanoiSolution.txt");
		PrintStream ps =new PrintStream(fos);
		solveHanoi(disks, fromPole, toPole, withPole, ps);
		ps.close();
		System.out.println();
		System.out.println("Amount of moves: "
		
	}

}
