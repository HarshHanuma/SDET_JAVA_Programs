package IMP_JavaPrograms;

import java.util.HashSet;

public class RemovingDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Removing duplicates from Integer Array
		int a[] = {12, 1, 5, 6, 3, 11, 12, 4, 3, 12, 1, 11, 4};
		
		HashSet<Integer> set = new HashSet();
		
		for(int arr:a)
		{
			set.add(arr);
		}
		System.out.println(set);
	
//Removing duplicates from String Array	
	String b[] = {"python", "java", "c", "sql", "java", "c", "python"};	
	HashSet<String> arrset = new HashSet();	
	for(String s : b)
	{
		if(arrset.add(s)==false)
			{
					System.out.println("Found duplicate elements:" + s);
			}
	}
	System.out.println(arrset);
	
//Removing duplicates from String	
	String str = "aaaabbbbbccccc";
	HashSet<Character> chset = new HashSet();
	for(char ch :str.toCharArray())
	{
		chset.add(ch);
	}
	System.out.println(chset);
	
}
}
