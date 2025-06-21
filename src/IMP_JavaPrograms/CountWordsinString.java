package IMP_JavaPrograms;

public class CountWordsinString {

	public static void main(String[] args) {


		// I am An Indian --> Here the words = 4
		// i am Harsha --> 3
		
		String str = "Jai Sree Ram jai Hanuma jai Sriram jai hanuman";
		int total_len = str.length();
		System.out.println(total_len);
		int count=1;
		
		for(int i=0; i<total_len ; i++)
		{
			if((str.charAt(i)==' ') && (str.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("the total words in a given String are :" + count);
		

	}

}
