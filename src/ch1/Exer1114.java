package ch1;

import edu.princeton.cs.algs4.*;

public class Exer1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdOut.print("Enter the number:");
		int i=StdIn.readInt();
	
		
		StdOut.print(lg(i));
		
	}

	public static int lg(int num) {
		
		int l=0;
		
		while (Math.pow(2,l) <= num)
		{
			l++;
		}
				 return l-1;
					
				
		
	}
}
