package algoClasses;

import java.util.ArrayList;
import java.util.Iterator;

/* Class in which one should be able to add string, int, double etc. and iterate through that
 *
 */

public class Bag<T> implements Iterable<T>{
	
	/* 
	 * we want to add generic object
	 * can i instantiate class Bag with list of strings or int or double
	 * can i have constructor with generic type
	 */
	
	
	
	public ArrayList<T> genericArray= new ArrayList<T>();
	
	
	public void add( T item) {
			genericArray.add(item);
		}
	
	public Iterator<T> iterator(){
		return genericArray.iterator();
	}

	public int size()
	{
		return genericArray.size();
	}
	
	
}
