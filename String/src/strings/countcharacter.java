package strings;

public class countcharacter {

	public static void main(String[] args) {
		String str="welcome to banglore";
		int  count=0; 
		for(int i=0;i<str.length();i++) 
		{
			if(str.charAt(i)=='o')
			{
				count++;
			}
			
		}
		System.out.println("count of given character is:"+count);

	}

}
