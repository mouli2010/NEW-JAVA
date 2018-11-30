package strings;

public class Compareto {

	public static void main(String[] args) {
		String s="Hai";
		String s1="Hello";
		String s2="raja";
		String s3 ="Hello";
		String s4=new String("Hello");
		String s5=new String("Hello");
		StringBuffer s6=new StringBuffer("raja");
		StringBuffer s7=new StringBuffer("raja");
		if(s1==s3)
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
		}
		if(s5.equals(s4))
		{
			System.out.println("both are same");
		}
		else
		{
			System.out.println("both are not same");
			
		}if(s6.equals(s7))
		{
			System.out.println("both  rajas are same");
		}
		else
		{
			System.out.println("both  rajas are not same");
			
		}
		s1=s1+s2;
		System.out.println(s1);
	}

}
