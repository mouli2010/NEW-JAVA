package strings;

public class Stringbuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hai");
		     String str="mouli";
		     sb.append(str);
		     System.out.println(sb);
		     str=sb.toString();
		     System.out.println(str);
		     //str=sb.append(str).toString();
		     str=sb.insert(3,"raja").toString();
		     System.out.println(str);
		     sb.replace(0, 3,"hello").toString();
		     System.out.println(sb);
		     sb.delete(1, 5).toString();
		     System.out.println(sb);
		     StringBuffer sb1=new StringBuffer("MOULI");
		    sb1.reverse().toString();
		    System.out.println(sb1); 
		    		 
		    		
	}

}
