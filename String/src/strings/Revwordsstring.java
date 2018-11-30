package strings;
import java.util.*;
public class Revwordsstring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enput String : ");
        String str = sc.nextLine();
        System.out.println("Input String : "+str);
        String str1[]=str.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s:str1)
        {
            if(!s.equals(" "))
            {
               StringBuilder str2 = new StringBuilder(s);
               String rev = str2.reverse().toString();
               sb.append(rev+" "); 
            }    
            
        }
        System.out.println("given String rev words : "+sb);
	}

}
