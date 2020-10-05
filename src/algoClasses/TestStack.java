package algoClasses;

import edu.princeton.cs.algs4.*;
public class TestStack {

	public static void main(String[] args) {  
		// Create a stack and push/pop strings as directed on StdIn. 
		Stack<String> s = new Stack<String>();
		while (!StdIn.isEmpty())   {
			String item = StdIn.readString();
			if (!item.equals("-"))
				s.push(item);
			else if (!s.isEmpty()) StdOut.print(s.pop() + " ");  
			}  
		StdOut.println("(" + s.size() + " left on stack)");
		
	}
}
