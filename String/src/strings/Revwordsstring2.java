package strings;

import java.util.Scanner;

public class Revwordsstring2 {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
	        System.out.println("Enput String : ");
	        String str = sc.nextLine();
	        StringBuilder sbr = new StringBuilder(str);
	        String st  = sbr.reverse().toString();
	        String str1[]=st.split(" ");
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


