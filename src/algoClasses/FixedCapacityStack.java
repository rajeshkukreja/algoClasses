package algoClasses;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Fixed capacity stack
 * push items
 * pop items from stack
 * size of the stack
 */

public class FixedCapacityStack<T>  {

	// can't initialize array of <T> not possible
	// so using the ArrayList
	// But Arraylist gets expended automatically
	
	int N=0;
	public T[] fixedstack;
	public FixedCapacityStack(int size) {
		fixedstack=(T[]) new Object[size];
		
	}
		public void push(T item) {
	
		fixedstack[N++]=item;
	}
	
	public T pop() {
		return fixedstack[--N];
		
	}
	
	 public boolean isEmpty() {  return N == 0; }   
	 public int size()        {  return N; } 
	

}
