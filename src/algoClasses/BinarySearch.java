package algoClasses;

import edu.princeton.cs.algs4.*;
import java.util.Arrays; 
public class  BinarySearch

{ 
	
	/*
	 * public static int[] readAllInts() { String[] fields = readAllStrings(); int[]
	 * vals = new int[fields.length]; for (int i = 0; i < fields.length; i++)
	 * vals[i] = Integer.parseInt(fields[i]); return vals; }
	 */
	public static int rank(int key, int[] a)	
	{ 
		// Array must be sorted.
		int lo  = 0;
		int hi = a.length - 1;
		while (lo <= hi)
		{  // Key is in a[lo..hi] or not present.
			int mid = lo + (hi - lo) / 2;
			if      (key < a[mid]) hi = mid - 1;
			else if (key > a[mid]) lo = mid + 1;
			else     
				return mid;
		}      return -1;   
	}    
	public static void main(String[] args)
	{
		//int[] whitelist =  {25,12,31,17,77,83,12,30,76,03,11}; 
		int[] whitelist=StdIn.readAllInts();
		Arrays.sort(whitelist);
		
				StdOut.print(whitelist.toString());
		
		int[] inputs=StdIn.readAllInts();
		StdOut.print(inputs[0]);
		
//		 while (!StdIn.isEmpty()) { // Read key, print if not in whitelist. 
			 //int key = StdIn.readInt();
int key = 15;
			 StdOut.println("key"+key);
			 if (rank(key, whitelist) < 0) 
				 StdOut.println(key); 
	// }
		
		
	}
	}



