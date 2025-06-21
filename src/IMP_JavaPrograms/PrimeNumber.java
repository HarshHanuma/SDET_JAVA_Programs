package IMP_JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the data");
		int number = scanner.nextInt();
		
		if (isPrime(number)) {
			System.out.println(number + " is a prime number.");
			} else {
			System.out.println(number + " is not a prime number.");
			}
			}

	public static boolean isPrime(int number) {
		for(int i =2; i<=number/2; i++)
		{
			if (number % i ==0)
			{
				return false;
			}			
		}	return true;	
		
	}
			
	}


