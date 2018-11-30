package loops;
import java.lang.*;
import java.util.Scanner;

public class Twoarr {

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter rows and coloumns");
	int r=sc.nextInt();
	int c =sc.nextInt();
	int arr[][]=new int[r][c];
	System.out.println("enter elements of a matrix");
	int j;
	for(int i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	for(int i=0;i<r;i++)
	{
		for( j=0;j<c;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}

	}

}
