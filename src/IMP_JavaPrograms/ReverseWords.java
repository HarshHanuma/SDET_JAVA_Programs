package IMP_JavaPrograms;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// I am Harsha ==> ahsraH ma I
		
		String str = "I am Harsha";
		String[] words= str.split(" ");
		
		StringBuilder builder = new StringBuilder();
		for(String word : words)
		{
			StringBuilder reverseword = new StringBuilder(word).reverse();
			
			builder.append(reverseword).append(" "); // Append reversed word and space
        }
        
        // Remove the trailing space and print
        System.out.println(builder.toString().trim());
    }
}


