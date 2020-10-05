package algoClasses;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

import edu.princeton.cs.algs4.StdRandom;

/*
 * QuickSort Class
 * 
 * Divide array into such that, there are no values on the left greater than the value at J, and no value on the right
 *  smaller than value on j
 *  and merger the array
 * 
 */
public class QuickSort extends ElemantrySort{

	
//	Comparable[] aux;
//	static Integer[] a= new Integer[100000];
//	static int counter=0;
//	
	public static void merge(Comparable[] a, Comparable[] aux, int lo,int mid, int hi) {
		
		
		for (int i=lo;i <= hi;i++) {
			aux[i]=a[i];
		}
		
		//set counter for left half counter_left=lo
		//set counter for right half counter_right=mid
		//
		
		int counter_left=lo;
		int counter_right=mid+1;
		
		for ( int k=lo;k<=hi;k++)
		{
			if(counter_left>mid)  a[k]=aux[counter_right++];
			else if (counter_right>hi)  a[k]=aux[counter_left++];
			else if (less(aux[counter_right], aux[counter_left])) a[k]=aux[counter_right++];
			else a[k]=aux[counter_left++];
		}
		
		
	}
	public  void sort(Comparable[] a, int lo, int hi)
	{
		int partition_index=partition(a,lo,hi);
		//System.out.println("partition inddddd="+partition_index);
		
		if(partition_index>0)
		{	
		sort(a,lo,partition_index);
		sort(a,partition_index+1,hi-lo);
		}
		
	}
	
	@Override
	public  void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		
		
		//StdRandom.shuffle(a);
		System.out.println("#######################3inside Quick SOrt################3");		
		int partition_index=partition(a,0,a.length-1);
		System.out.println("partition index="+partition_index);
		sort(a,0,partition_index);
		sort(a,partition_index+1,a.length-1);
		
	}

	public int partition(Comparable[] a,int lo,int hi) {
		
		int j= (int)a[lo];
		int start_index=lo;
		//int high_index=hi;
		while(lo<hi)
		{
			if(j>=(int)a[lo]) lo++;
			else if (j<=(int)a[hi]) hi--;
			else 
			{
//				int temp=(int)a[lo];
//				a[lo]=a[hi];
//				a[hi]=temp;
//	
				exch(a,lo,hi);
			}
		}
		//
		if(lo>0)
		{
		lo--;
		exch(a,start_index,lo);
		}
		
		// index of a[o] element at start
		return (lo); 
		
	}

}
