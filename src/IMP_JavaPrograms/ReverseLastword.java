package IMP_JavaPrograms;

import java.util.Arrays;

public class ReverseLastword {

	public static void main(String[] args) {


		String str = "I Love Java Programming";
		//Output = "I Love Java gnimmargorP
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words));
		System.out.println("Length of an Array:" + words.length);
		
		String lastword = words[words.length-1];
		/*
		String last = new StringBuilder(lastword).reverse().toString();
		 
		System.out.println(last);
		
		words[words.length-1] = last;
		
		System.out.println(Arrays.toString(words));
		
		String result = String.join(" ", words);
		System.out.println(result);
		
		*/
		String reversed="";
		for(int i =lastword.length()-1; i>=0; i-- )
		{
			reversed+= lastword.charAt(i);
			
		}
		System.out.println(reversed);
		
		words[words.length-1] = reversed;
		System.out.println(String.join(" ", words));
		
		
		
		

	}

}
