package algoClasses;

import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Random;

public class SortClient {

	static Integer[] a= new Integer[100000];

	
	private static void writeFileContents() throws IOException {
		 
        try (FileWriter fileWriter = new FileWriter("randomnumber1.txt")) {
        	
        	
        	Random rd=new Random();
    		//rd.nextInt();
    		for(int i=0;i<100000;i++)
    		{
    			fileWriter.write(String.valueOf(a[i]));
    			fileWriter.write(", ");
    		}
    		
        	
         }
    }

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

Instant start=Instant.now();
		
		Integer[] a= new Integer[] {7,4,3,8};
		//45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6,3,4,1,9,32,100,23,43,98,45,75,87,3,2,5,1,8,0,6
		System.out.println("size of array="+a.length);
		ElemantrySort sh=new QuickSort();
//		Random rd=new Random();
//		//rd.nextInt();
//		for(int i=0;i<100000;i++)
//		{
//			a[i]=rd.nextInt(1000000);
//		//System.out.println("random number="+rd.nextInt());	
//		}
//		
		System.out.println("###########33inside sorintg*****************8");
		sh.sort(a);
		sh.show(a);
		//writeFileContents();
		Instant end=Instant.now();
		System.out.println("totalTime="+Duration.between(start,end));
		
	
		
	}

}
