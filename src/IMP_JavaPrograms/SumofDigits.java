package IMP_JavaPrograms;

// SUm of Digits
//12345 = 1+2+3+4+5 = 15
public class SumofDigits {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12345678;
		
		int count = 0;
		while(num>0)
		{
			count = count + (num % 10);			
			num = num/10;
			
		}
		System.out.println(count);

	}

}
