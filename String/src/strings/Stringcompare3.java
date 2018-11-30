package strings;

public class Stringcompare3 {

	public static void main(String[] args) {
		
		String s1="rajamouli";
		String s2="rajamouli";
		String s3= new String("RAJAMOULI");
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s3.compareTo(s1));
		System.out.println(s1.compareToIgnoreCase(s3));
	}

}
