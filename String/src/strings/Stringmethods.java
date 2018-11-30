package strings;

public class Stringmethods {

	public static void main(String[] args) {
		String s=" RAJAmouli ";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s);    
		System.out.println(s.trim());
		System.out.println(s.startsWith(" RA")); 
		System.out.println(s.startsWith("AB"));
		System.out.println(s.endsWith("I"));
		 System.out.println(s.endsWith("i"));
		 System.out.println(s.charAt(2));
		 System.out.println(s.length());
		 int a=10;  
		 String s1=String.valueOf(a);  
		 System.out.println(s1+10);
		 String s2="Java is a programming language. Java is a platform. Java is an Island.";    
		 String replaceString=s2.replace("Java","bava");   
		 System.out.println(replaceString); 

	}

}
