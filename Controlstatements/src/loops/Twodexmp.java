package loops;

import java.lang.*;
import java.util.*;
public class Twodexmp
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows and coloumns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("give elements to array");
		
         for(int i=0;i<r;i++)
         {
        	 for (int j = 0; j <c; j++) 
        	 {
				
        		 a[i][j]=sc.nextInt();
			}
         }
         System.out.println("printing array");
         for(int i=0;i<r;i++)
         {
        	 for (int j = 0; j <c; j++) 
        	 {
				
        		 System.out.print(a[i][j]+"\t");
			}
        	 System.out.println();
         }
	}

}
