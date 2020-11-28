package algoClasses;

import java.util.Iterator;

public class MaxPriorityQueue <Key extends Comparable<Key>> {

	private Key txns[];
	private int i=0;
	//Method to create Priority QUeue
	public void MaxPriorityQueue() {
		txns= (Key[]) new Comparable [6];
	}
	
	//method to create PQ of size max
	public void MaxPriorityQueue (int max)
	{
		txns= (Key[]) new Comparable [max+1];
	}
	// create a PQ with keys 
	//public void MaxPriorityQueue (Key[] a)

	public boolean isEmpty()
	 { return i == 0; }
	 public int size()
	 { return i; }
	
	private void swim(int k) {
		while (k>1 && ElemantrySort.less(txns[k/2],txns[k]))
		{
			ElemantrySort.exch(txns,k,k/2);
			k=k/2;
		}
	}
	
	//insert key in PQ
	public void insert( Key v)
	{
		txns[++i]=v;
		swim(i);
	}

	private void sink(int k) {
		 while(2*k <=i) {
			 int j=2*k;
			 if (j<i && ElemantrySort.less(j,j+1)) j++;
			 if(!ElemantrySort.less(k,j)) break;
			 ElemantrySort.exch(txns,k,j);
			 k=j;
		 }
	}
	
	public Key delMin()
	{
		Key max= txns[1];
		ElemantrySort.exch(txns, 1, i--);
		sink(1);
		return max;
		
	}

	public void show() {
		for(int l=1;l<=5;l++)
			System.out.println(txns[l].toString());
	}
	
}
