package IMP_JavaPrograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the data");
		int number = 10;
		int first = 0;
		int second = 1;
		int next;
		System.out.print("Fibonacci series is :");
		for (int i=0; i <= number ; i++)			
		{
			System.out.println(first + "");
			next = first+second;
			first = second;
			second = next;
			
			
		}
		

	}

}
