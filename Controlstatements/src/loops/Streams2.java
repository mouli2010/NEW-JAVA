package loops;

import java.io.*;
import java.io.InputStreamReader;

public class Streams2 {

	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter a name: ");
	      String str =br.readLine();
	      System.out.println("you entered :"+str);


	}

}
