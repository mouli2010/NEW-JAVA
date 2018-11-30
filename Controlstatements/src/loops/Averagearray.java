package loops;

public class Averagearray {

	public static void main(String[] args) 
	{
		int sum=0;
		int arr[]={22,20,41,55,16,60,100};
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
  float average=sum/arr.length;
  System.out.println("average is:"+average);
  
	}

}
