package strings;
import java.util.*;
public class Palindrom {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
        String revstr="";
		for(int i=str.length()-1;i>=0;i--)
		{
	          revstr=revstr+str.charAt(i);
		}

			System.out.println("reverse string is:"+revstr);
			if(str.equalsIgnoreCase(revstr))
	        {
	            System.out.println("The string is palindrome.");
	        }
	        else
	        {
	            System.out.println("The string is not palindrome.");
	        }

	}

}
