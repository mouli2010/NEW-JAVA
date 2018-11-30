package oops;

public class Varargs {
	static int max(int...x)
	{
		int max=x[0];
		for (int i = 1; i < x.length; i++) {
			if(max<x[i])
			{
				max=x[i];
			}
		}
		return max;
		
	}
	
	public static void main(String[] args)
	{
		int arr1[]={20,10,5,35,40};
		int result=max(arr1);
		System.out.println("maximum  is:"+result);
		int arr2[]={1,2,3};
		result=max(arr2);
		System.out.println("maximum  is:"+result);
		result=max(10,20);
		System.out.println("maximum  is:"+result);
	}

}
