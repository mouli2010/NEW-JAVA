package strings;
public class Stringvowels {

	
	public static void main(String[] args) {
		String str="welcome to banglore";
		int len=str.length();
		 char ch[]= new char[len];
		char ch1[]=new char[len];
		int  count=0,counter=0; 
		System.out.println("number of vowels  is:");
		for(int i=0;i<len;i++) 
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
			{
				ch[count]=str.charAt(i);
				count++;
			}
		}
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);  
			
		}
		System.out.println("count of vowels  is:"+count);
		System.out.println("number of consonents is:");
		for(int i=0;i<len;i++) 
		{
			
			if(!(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'))
			{
				ch1[counter]=str.charAt(i);
				counter++;
			}
			
		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);
			
			
		}
		System.out.println("count of consonents  is:"+counter);

	}

}
