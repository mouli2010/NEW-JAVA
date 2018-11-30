package loops;

import java.util.Scanner;

public class Multwoarr {

	public static void main(String[] args) 
	{
	
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter rows and coloumns");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		int b[][]=new int[r][c];
		int z[][]=new int[r][c];
		System.out.println("give elements to  a array");
		 for(int i=0;i<r;i++)
         {
        	 for (int j = 0; j <c; j++) 
        	 {
				
        		 a[i][j]=sc.nextInt();
			}
         }
		 System.out.println("give elements to  b array");
		 for(int i=0;i<r;i++)
         {
        	 for (int j = 0; j <c; j++) 
        	 {
				
        		 b[i][j]=sc.nextInt();
			}
         }
		 for (int i = 0; i <r; i++)
			{
				
				for (int j = 0; j <c; j++) 
				{
					z[i][j]=0;
					for (int k= 0; k <r ; k++) 
					{
						
						z[i][j]=z[i][j]+a[i][k]*b[k][j];
						
					}
					System.out.print(z[i][j]+"\t");
					
				}
				System.out.println();
			}
	}

}
