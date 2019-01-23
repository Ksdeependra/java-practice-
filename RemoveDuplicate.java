import java.util.Scanner;
public class RemoveDuplicate
{
 
	public static void main(String args[])
	{
		System.out.println("Input String");
      	        Scanner scan = new Scanner(System.in);
		String input= scan.nextLine();
		countWords(input);
		
	}
 
	static void countWords(String st)
	{
		
		String[] words = st.split("\\s");
 
		for (int i = 0; i < words.length; i++)
		{
			for (int j = 0; j < words.length; j++)
			{
				if (words[i].equals(words[j]))
				{
					if (i != j)
						words[i] = "";
 
				}
			}
		}
 
		System.out.println("Removing Duplicate words:\n");
		for (int i = 0; i < words.length; i++)
		{
 
			if (words[i] != "")
			{
				System.out.print(words[i]+" ");
 
			}
		}
	}
}