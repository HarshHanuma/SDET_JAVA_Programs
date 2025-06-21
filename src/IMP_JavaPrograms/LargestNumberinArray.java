package IMP_JavaPrograms;

public class LargestNumberinArray {

	public static void main(String[] args) {


		//Find largest number in an Array
		//int[] b = new int[6];
		
		int[] A = {10, 20,5,6,25,11,45,18,2,99};
		System.out.println(A.length);
		int max = A[0];
		
//		for(int i=1; i<A.length;i++)
//		{
//			if(A[i] > max)
//			{
//				max=A[i];
//			}
//	
//		}
		
		for(int a :A)
		{
			if(a>max)
			{
				max=a;
			}
		}
		System.out.println("Printing the Maximum number " + max);
		
		
		

	}

}
