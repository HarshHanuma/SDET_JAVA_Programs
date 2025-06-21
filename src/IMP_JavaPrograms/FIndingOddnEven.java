package IMP_JavaPrograms;

import java.util.Scanner;

public class FIndingOddnEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the data");
		int number = scanner.nextInt();
		
		if(number%2==0)
		{
		System.out.print(number+ " : is Even number");
		}
		else {
			System.out.print(number+ " : is Odd number");
		}

	}

}
