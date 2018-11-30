package strings;

import java.util.Scanner;

public class Countwords {

	public static void main(String[] args) 
	{
		//String str="java is a object oriented programing language";
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String str=sc.nextLine();
		 String str1 []=str.split(" ");
		  
		 int n=str1.length;
		 System.out.println("no of words in given string is:"+n);
		 System.out.print("Enter a character:");
		 char ch =sc.next().charAt(0);
		 int count=0;
		 for(int i=0;i<n;i++)
		 {
			 if(str1[i].charAt(0)==ch)
			 {
				 count++;
				 System.out.println(str1[i]);
			 }
		 }
		 System.out.println("no of words starts with given character is:"+count);

	}

}
