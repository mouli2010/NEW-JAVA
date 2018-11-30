package loops;

public class Returnarray {
	static int[] get()
	{
		return new int[]{10,12,15,18};
	}

	public static void main(String[] args) {
		int arr[]=get();
		for (int i = 0; i < arr.length; i++) 
		{
		System.out.print(arr[i]+"\t");	
		}
		

	}

}
