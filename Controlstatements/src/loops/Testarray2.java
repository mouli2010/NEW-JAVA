package loops;

public class Testarray2 
{
     static  void min(int arr[])
     { 
    	 int min=arr[0];
    	 for(int i=1;i<4;i++)
    	 {
    		 
    	if(min>arr[i])
    	{
    		min=arr[i];
    	}
    	 }
    	 System.out.println(min);
    	 
     }
	public static void main(String[] args) 
	{
		
        int a[]={33,3,4,5};
        min(a);
	}

}
