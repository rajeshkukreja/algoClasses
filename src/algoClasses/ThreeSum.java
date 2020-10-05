package algoClasses;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ThreeSum {

	public static int count(int[] a)
	{
		int N=a.length;
		int count=0;
		for( int i=0; i<N; i++)
			for(int j=i+1;j<N;j++)
				for(int k=j+1;k<N;k++)
				{
					if (a[i]+a[j]+a[k]==0)
						count++;
				}
		return count;
	}
	
	public static void main(String[] args)
	{
		Stopwatch sw=new Stopwatch();
		int[] a=StdIn.readAllInts();
		
		//In.readInts(args[0]);
		StdOut.println(count(a));
		StdOut.println(sw.elapsedTime());
		
	}
}
