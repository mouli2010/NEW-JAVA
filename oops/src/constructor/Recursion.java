package constructor;

public class Recursion {

	public static void main(String[] args)
	{
	 System.out.println(recursion(5));

	}
    static int recursion(int n)
    {
    	int temp;
    	if(n==1){
    		return 1;
    	}
    	temp= n*recursion(n-1);
    	return temp;
    }

}
