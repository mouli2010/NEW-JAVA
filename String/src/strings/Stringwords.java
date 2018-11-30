package strings;

public class Stringwords {

	public static void main(String[] args) 
	{
		String str="java is a object oriented programing language";
		 String str1 []=str.split(" ");
		 for(String words:str1)
		  
		 {
			 System.out.println(words);
		 }
		  
		 int n=str1.length;
		 System.out.println("no of words in given string is:"+n);

	}

}
