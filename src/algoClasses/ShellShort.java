package algoClasses;

public class ShellShort extends ElemantrySort {

	
	public void sort(Comparable[] a)
	 { 
		
	/*
	 * ShellSorting method
	 * start with x=1 and increment 3X+1, 3X+1 shold be less than elements in array
	 * start with highest number assign to H and do selection sort for elements of that length
	 * do till H=1
	 * 
	 */
		
	 int N = a.length;
	 int H=1;//3H+1= 1,4, 13,40 
	 
	 while(H<N) H=3*H+1;
	 System.out.println("final value of H= " + H);

	 	 
	 while(H>=1)
	 {
		for (int i=0;i<(N-H);i++)
	
			if(less(a[i+H],a[i])) { 
				show(a);
				exch(a,i,i+H);
				show(a);
				for(int j=i+H;j>0;j=j-H) {
					if((j-H)>=0)
					if(less(a[j],a[j-H])) exch(a,j, j-H);
				}
			}
		
	 
		H=(H-1)/3;
	 System.out.println("H="+H);
	 }
		 
	 
	  
//	 //for (int i = 1; i < N; i++)
//	 { // Insert a[i] among a[i-1], a[i-2], a[i-3]... ..
//	 for (int j = i; j > 0 && less(a[j], a[j-1]); j--)
//	 exch(a, j, j-1);
//	 }
//	 
	 }


	public static void main(String[] args) {
		/*
		 * read set of input integers and sort using selection sort
		 */
		
		Integer[] a= new Integer[] {3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6};
		
		ShellShort sh=new ShellShort();
		//String[] a= new String[] {"Rajesh","Aaryna", "Ritu", "Pankaj","Gagan"};
		
				//StdIn.readAllInts();
		
		
		sh.sort(a);
		sh.show(a);
		
	}
}
