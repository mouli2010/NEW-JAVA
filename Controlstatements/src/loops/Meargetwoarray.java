package loops;

public class Meargetwoarray {

	public static void main(String[] args) {
		int arr1[]={10,20,30};
		int arr2[]={40,50,60,70};
		int mearge[]=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++)
		{
			mearge[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++)
		{
			mearge[i+arr1.length]=arr2[i];
		}
		for( int x:mearge)
		{
			System.out.println(x);
		}


	}

}
