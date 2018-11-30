package loops;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		      int num=sc.nextInt();
		     /* int fact=num,count=num-1;
		      while(count>1)
		      {
		    	  fact=fact*count;
		    	  count--;
		      }
		      System.out.println("factorial number is:"+fact);*/
		      int fact=num;
		     /* for(int i=1;i<num;i++)
		      {
		    	  fact=fact*i;
		      }
		      System.out.println("factorial number is"+fact);*/
		      for( int i=num-1;i>=1;i--)
		      {
		    	  fact=fact*i;
		      }
		      System.out.println("factorial number is"+fact);
	}

}
