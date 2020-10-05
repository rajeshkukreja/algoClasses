package algoClasses;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

/*
 * MergeSort Class
 * 
 */
public class MergeSort extends ElemantrySort{

	
	Comparable[] aux;
	static Integer[] a= new Integer[100000];
	static int counter=0;
	
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
	public static void sort(Comparable[] a, Comparable[] aux, int lo, int hi)
	{
		if(hi<=lo) return;
		int mid= lo + (hi-lo)/2;
		sort(a,aux,lo,mid);
		sort(a,aux,mid+1,hi);
		merge(a,aux,lo,mid,hi);
	}
	
	@Override
	public  void sort(Comparable[] a) {
		// TODO Auto-generated method stub
		aux=new Comparable[a.length];
		System.out.println("#######################3inside MErger SOrt################3");		
		sort(a,aux,0,a.length-1);	
		
	}


    	public static void main(String[] args) throws IOException {
		/*
		 * read set of input integers and sort using selection sort
		 */
//		Instant start=Instant.now();
//		
//		//Integer[] a= new Integer[] {3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6};
//		System.out.println("size of array="+a.length);
//		ElemantrySort sh=new MergeSort();
//		Random rd=new Random();
//		//rd.nextInt();
//		for(int i=0;i<100000;i++)
//		{
//			a[i]=rd.nextInt(1000000);
//		//System.out.println("random number="+rd.nextInt());	
//		}
//		
//		sh.sort(a);
//		//sh.show(a);
//		writeFileContents();
//		Instant end=Instant.now();
//		System.out.println("totalTime="+Duration.between(start,end));
//		
//		
	}
}
