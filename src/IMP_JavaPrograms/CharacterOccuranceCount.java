package IMP_JavaPrograms;

import java.util.HashMap;

public class CharacterOccuranceCount {

	public static void main(String[] args) {

		//Use Hashmap
			//JaiSreeram
		//a=2,r=2,e=2,j=1,i=1,s=1,m=1
		
		
		String str = "jai sree ram jai hanuman";
		
		HashMap<Character, Integer> hm = new HashMap();
		
		char[] t_char = str.toCharArray();
		
		for(char ch:t_char)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch,1);
			}
			
		}
		System.out.println(hm);
		
		
}
}
