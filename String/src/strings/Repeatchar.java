package strings;
import java.util.*;
public class Repeatchar {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner (System.in);
		System.out.print("Enter the Statement : ");
		String str= scan.nextLine();
		int count=0;
		String temp="";
		
			for(int i=0;i<str.length();i++)
			{
				char ch1=str.charAt(i);
				for(int j=0;j<str.length();j++)
				{
					char ch2=str.charAt(j);
					if(ch1==ch2)
					{
						count=count+1;
					}
					
				}
				if(temp.indexOf(ch1)==-1)
				{ 
					temp=temp+ch1;
				
				System.out.println(ch1+":"+count);	
			}
			count=0;
			}
		
	}

}
