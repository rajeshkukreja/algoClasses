package algoClasses;

/*
 * Stack class
 * push the items on the stack
 * pop the items from the stack
 * use linked list concept of having item and reference to the next node
 */

public class Stack<T>
{

	/*
	 * define an inner class to hold the item and reference to next node
	 */
	
	Element First;
	int count=0;
	
	class Element{
		T item;
		private Element node; 
	}
	
	public boolean isEmpty()
	{
		return count==0;
	}
	
	public int size()
	{
		return count;
	}
	
	public void push(T value) {
		
		Element oldFirst=First;
		First=new Element();
		First.item=value;
		First.node=oldFirst;
		count++;				
	}
	
	public T pop() {
		
		T returnValue=First.item;
		First=First.node;
		count--;
		return 	returnValue;
		
		
	}
}
