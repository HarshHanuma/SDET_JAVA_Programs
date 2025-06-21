package IMP_JavaPrograms;

public class SmallestNumberinArray {

	public static void main(String[] args) {


		//Find largest number in an Array
		//int[] b = new int[6];
		
		int[] A = {10, 20,5,6,25,11,45,18};
		System.out.println(A.length);
		int small= A[0];
		
	/*	for(int i=1; i<A.length;i++)
		{
			if(A[i] < small)
			{
				small=A[i];
			}
	
		}
		System.out.println("Printing the Smallest number " + small);
		*/
		
		for(int a :A)
		{
			if(a < small)
			{
				small=a;
			}
		}
		System.out.println("Printing the Smallest number " + small);
		
	
		

	}

}
