package IMP_JavaPrograms;

public class Swapnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 25;
		int b = 30;
		
		System.out.println("Before a value:" + a +"," +"Before b value is:"+ b);
		
		//Method 1 Using Arthemetic operator
		//Swapping
		/*
		a = a+b;
		b = a-b;
		a = a - b;
		System.out.println("After swapping a value now "+a);
		System.out.println("After swapping b value now "+b);
		*/
		
		//Method 2 Using XOR operator
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b ;
		System.out.println("After swapping a value now "+a);
		System.out.println("After swapping b value now "+b);
	}

}
