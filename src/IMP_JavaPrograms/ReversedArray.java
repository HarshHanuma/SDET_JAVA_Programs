package IMP_JavaPrograms;

import java.util.Arrays;
import java.util.Collections;

//Array[]={1,2,3,4,5,6}
//Reverse[] = {6,5,4,3,2,1}

public class ReversedArray {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8};
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		
		
		int start = 0;
		int end = arr.length-1;
		int temp =0;
		
		while(start<end)
		{
			//Swap elements
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			
			start++;
			end--;
		}
		System.out.println("Reversed Array: " + Arrays.toString(arr));
		

	}

}
