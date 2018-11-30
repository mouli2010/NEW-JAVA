package loops;

import java.io.*;
import java.io.InputStreamReader;

public class Streams {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      System.out.println("enter a character: ");
	      char ch=(char)br.read();
	      System.out.println("you entered :"+ch);

	}

}
