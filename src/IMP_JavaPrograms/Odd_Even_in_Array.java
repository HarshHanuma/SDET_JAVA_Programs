package IMP_JavaPrograms;

import java.util.ArrayList;

public class Odd_Even_in_Array {

	public static void main(String[] args) {
		
		//Finding EVEN and ODD numbers
		
		int[] arr = {1,2,3,4,5,6,7,8,9,11,12,20};
		
		ArrayList<Integer> even = new ArrayList();
		ArrayList<Integer> odd = new ArrayList();
		
		for(int num : arr)
		{
			if(num%2==0)
			{
				even.add(num);
			}
			else
			{
				odd.add(num);
			}
		}
		System.out.println("Even numbers in the String are:" + even);
		System.out.println("odd numbers in the String are: "+ odd);
		

	}

}
