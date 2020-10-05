package algoClasses;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class SelectionSort extends ElemantrySort {
	/*
	 * this class will sort the list of input
	 * and mechanism used is java callback where object to be sorted
	 * will implement the comparable interface.
	 * One method sort is required, to which we will pass the list of array
	 * and should it return the sorted list
	 */

	public void sort(Comparable[] a)
	 { // Sort a[] into increasing order.
	 int N = a.length;
	 for (int i = 1; i < N; i++)
	 { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
	 for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
	 exch(a, j, j-1);
	 }
	 }

	
	
	
	
	public static void main(String[] args) {
		/*
		 * read set of input integers and sort using selection sort
		 */
		
		//Integer[] a= new Integer[] {3,4,1,9,32};
		String[] a= new String[] {"Rajesh","Aaryna", "Ritu", "Pankaj","Gagan"};
		
				//StdIn.readAllInts();
		
		
		//sort(a);
		show(a);
		
	}
}
