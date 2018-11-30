package loops;

import java.util.Scanner;

public class Fibinoseries {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		int a=0,b=1,c=0;
            System.out.print(a+" "+b);
            for(int i=3;i<=num;i++){
            	c=a+b;
            	System.out.print(" "+c);
            	a=b;
            	b=c;
            }
	}

}
