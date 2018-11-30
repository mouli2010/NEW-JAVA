package loops;

public class Commandargsexp {

	public static void main(String[] Y) 
	{
		System.out.println("enter elements");
	   int temp=0;
	   for (int i = 0; i < Y.length; i++) 
	   {
		   temp+=Integer.parseInt(Y[i]);
		
	}
	   System.out.println(temp);

	}

}
