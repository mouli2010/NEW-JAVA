package loops;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {

Scanner sc=new Scanner(System.in);
System.out.println("enter a number");
      int num=sc.nextInt();
      int i=1,count=0;
      while(i<=num)
      {
    	  if (num%i==0)
    	  {
    		 count++;
    		 
    	  }
    	  i++;
      }
      if(count==2)
      {
    	  System.out.println("prime number is"+num);
      }
      else
      {
      System.out.println("not a prime number");
      }
	}

}
