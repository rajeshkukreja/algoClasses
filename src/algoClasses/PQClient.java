package algoClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.princeton.cs.algs4.StdIn;

public class PQClient {

	public static void main(String[] args) throws FileNotFoundException {
		// Print the top M lines in the input stream.

		int M = 5;
		MaxPriorityQueue<Transaction> pq = new MaxPriorityQueue<Transaction>();

		File transactionText = new File("TransactionsDataSet.txt");

		Scanner scnr = new Scanner(transactionText);

		while (scnr.hasNextLine()) {
			String line = scnr.nextLine();
			// System.out.println(line);

//		while (StdIn.hasNextLine()) { // Create an entry from the next line and put on the PQ.
//			
			pq.insert(new Transaction(line));

			if (pq.size() > M)
				pq.delMin(); // Remove minimum if M+1 entries on the PQ.
		}

		
		
		// // Top M entries are on the PQ.
//		Stack<Transaction> stack = new Stack<Transaction>();	
//		
//		while (!pq.isEmpty())
//			stack.push(pq.delMin());
//
//		for (Transaction t : stack)
//			System.out.println(t);

	//pq.show();
		
	}

}