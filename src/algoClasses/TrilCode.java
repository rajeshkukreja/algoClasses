package algoClasses;

import edu.princeton.cs.algs4.*;
import java.util.Scanner;
public class TrilCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stubRaje
		
		/*
		 * Scanner myObj = new Scanner(System.in);
		 * 
		 * System.out.println("Enter name, age and salary:");
		 * 
		 * // String input String name = myObj.nextLine();
		 * 
		 * // Numerical input int age = myObj.nextInt(); double salary =
		 * myObj.nextDouble();
		 * 
		 * // Output input by user System.out.println("Name: " + name);
		 * System.out.println("Age: " + age); System.out.println("Salary: " + salary);
		 */		

		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty())
		{  
			// Read a number and cumulate the sum.
			sum += StdIn.readDouble();
			cnt++; 
		}
		double avg = sum / cnt;
		StdOut.printf("Average is %.5f\n", avg);
		}
		
		
	}

	
	

