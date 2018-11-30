package strings;

public class Venkat {

	public static void main(String[] args) {
		String str="abcd";
		for(int i=0;i<str.length();i++) 
		{
			for (int j = 0; j <= i; j++) 
			{
				System.out.print(str.charAt(i));
				
			}
			System.out.print("-");
			
		}

	}

}
