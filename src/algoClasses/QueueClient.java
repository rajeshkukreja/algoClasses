package algoClasses;
import edu.princeton.cs.algs4.*;
public class QueueClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] que=readInts("Numbers.txt");
		for(int i:que)
		System.out.println(i);
		
	}
	
	public static int[] readInts(String name)
	{
	 In in = new In(name);
	 FifoQueue<Integer> q = new FifoQueue<Integer>();
	 while (!in.isEmpty())
	 q.enqueue(in.readInt());
	 int N = q.size();
	 int[] a = new int[N];
	 for (int i = 0; i < N; i++)
	 a[i] = q.dequeue();
	 return a;
	}

}
