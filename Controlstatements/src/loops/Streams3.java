package loops;

import java.io.*;
import java.io.InputStreamReader;

public class Streams3 {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter a int value: ");
	      String str =br.readLine();
	      int num=Integer.parseInt(str);
	      System.out.println("you entered :"+num);


	}

}
