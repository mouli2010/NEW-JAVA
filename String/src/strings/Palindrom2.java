package strings;

import java.util.Scanner;

public class Palindrom2 {

	public static void main(String[] args) {
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter the string");
	     String str=sc.nextLine();
	     StringBuffer sb=new StringBuffer(str);
	     String revstr=sb.reverse().toString();
	     if(str.equals(revstr))
	     {
	    	 System.out.println("given string is palindrom");
	     }
	     else 
	     {
	    	 System.out.println("given string is not  palindrom");
	     }

	}

}
