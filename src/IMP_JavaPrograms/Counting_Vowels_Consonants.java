package IMP_JavaPrograms;

public class Counting_Vowels_Consonants {

	public static void main(String[] args) {

		//JaiSriRam Jai Bhajarangabali
		
		//String word = "JaiSriRam Jai Bhajarangabali";
		String word = "JaiHanuman Gnana Guna Sagara";
		
		int Vowels=0;
		int Consonants=0;
		int Space =0;
		
		//converting string to lowercase
		word =  word.toLowerCase();
		 
		int total_length = word.length();
		System.out.println(total_length);
		
		for(int i=0; i<total_length;i++)
		{
			char ch = word.charAt(i);
			
			
			if((ch>='a') && (ch<='z'))
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					Vowels++;
				}
				else
				{
					Consonants++;
				}
			}
			else if(ch==' ')
			{
				Space++;
			}
			
		}
		System.out.println("The number of vowels present: " + Vowels);
		System.out.println("The number of consonants present: " + Consonants);
		System.out.println("The number of spaces present in text are: " + Space);
		
		int count = Vowels + Consonants + Space ;		
		System.out.println(count);

	}

}
