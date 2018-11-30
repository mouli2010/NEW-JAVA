package oops;

import java.util.Scanner;

class Matrix
{
	int arr[][];
	int r,c;
	Matrix(int r,int c)
	{
		this.r=r;
		this.c=c;
		arr=new int[r][c];
	}
	public int[][] getMatrix()
	{
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < r; i++)
		{
			for (int j = 0; j < c; j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public int[][] findSum(int a[][],int b[][]) 
	{
		int temp[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for (int j = 0; j <c; j++) {
				temp[i][j]=a[i][j]+b[i][j];
				
			}
	     }
		return temp;
		}
	void dispalyMatrix(int res[][])
	{
		for (int i = 0; i <r;i++) 
		{
			for (int j = 0; j < c; j++) {
				System.out.print(res[i][j]+"\t");
				
			}
			System.out.println();
			
		}
	}
	

}
public class Matrixsum {

	public static void main(String[] args) {
		
		Matrix obj1=new Matrix(3,3);
		Matrix obj2=new Matrix(3,3);
		int x[][],y[][],z[][];
		System.out.println("enterelements for first matrix:");
		x=obj1.getMatrix();
		System.out.println("enterelements for second matrix:");
		y=obj2.getMatrix();
		z=obj1.findSum(x, y);
		System.out.println("the sum of matrix is:");
		obj2.dispalyMatrix(z);
	}

}
