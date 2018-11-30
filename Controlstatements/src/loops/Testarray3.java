package loops;

public class Testarray3 {
	static void  printarray(int arr[])
	{
		for (int i = 0; i < arr.length; i++) 
		{
		System.out.print(arr[i]+"\t");	
		}
	}

	public static void main(String[] args) {
		printarray( new int []{10,20,30,40});

	}

}
