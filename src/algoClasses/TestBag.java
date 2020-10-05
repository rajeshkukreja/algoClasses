package algoClasses;

import edu.princeton.cs.algs4.StdIn;

public class TestBag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bag<String> text = new Bag<String>();
		while (!StdIn.isEmpty())
			text.add(StdIn.readString());
		int N = text.size();
		System.out.println(" Size="+N);
		double sum = 0.0;
		for (String x : text)
			System.out.println(x);;     
		
	}

}
