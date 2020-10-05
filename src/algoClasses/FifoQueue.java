package algoClasses;

import java.util.ArrayList;
import java.util.Iterator;

public class FifoQueue<Item> implements Iterable<Item> {
	
	public ArrayList<Item> genericArray= new ArrayList<Item>();
	/*
	 * add an item to queue
	 * */
	void enqueue(Item item) {
	
		genericArray.add(item);
		
	}
	
	/*
	 * remove the last recently added item to queue
	 * */
	Item dequeue() {
		int index=0;
		index=genericArray.size();
		
		return genericArray.remove(index-1);
		
	}

	/*
	 * check is queue empty
	 * */
	boolean isEmpty() {
		return genericArray.isEmpty();
	}
	/*
	 * number of items in queue
	 * */
	int size() {
		return genericArray.size();
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return genericArray.iterator();
	}
}
