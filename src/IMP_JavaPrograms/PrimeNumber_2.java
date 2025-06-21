package IMP_JavaPrograms;

import java.util.Scanner;

//Natural number > 1
//Which has only two factors 1 and itself
// 19 -> 1 & 19
// 8 -> 1, 2 4, 8

public class PrimeNumber_2 {

	public static void main(String[] args) {
		
		//int num = 8;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Prime or not");
		int num = sc.nextInt();
		int count = 0;
		
		if(num > 1)
		{
			for(int i=1; i<=num; i++)
			{
				if(num % i == 0)
				{
					count++;
				}
	    	}
			if(count == 2)
			{
				System.out.println(num+" is a prime Number its count is: " +count);
			}
			else
				System.out.println(num+" is not a prime Number because its divisble count is :" + count);
		}
		else
		{
			System.out.println(num+" Not a prime Number");
		}
		
		
		

	}

}
