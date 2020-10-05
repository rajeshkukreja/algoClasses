package algoClasses;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class QuickUnionUF {

	private int[] id;
	
	QuickUnionUF (int N){
	id =new int[N];
	for (int i=0;i<N;i++)
		id[i]=i;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p)==root(q);
	}
	
	public int root(int p)
	{
		while(!(id[p]==p)) p=id[p];
		return id[p];
	}
	
	public void union(int p, int q)
	{
		int pID=root(p);
		int qID=root(q);
		 id[pID]=qID;
						
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N= StdIn.readInt();
		QuickUnionUF uf= new QuickUnionUF(N);
		while(!StdIn.isEmpty())
		{
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			
			if(uf.connected(p, q)) continue;
			uf.union(p, q);
			StdOut.println(p+ " root = " +uf.id[p]);
			StdOut.println(q+ " root = " +uf.id[q]);
				for (int k=0; k<uf.id.length;k++)
					StdOut.println(uf.id[k]);
		}

	}

}
