package strings;

 class BathTub {
  String tubName;
 public BathTub(String tubName){
  this.tubName = tubName;
}
 
}
 
class BathRoom  implements Cloneable{
	  int length;
	  int width;
	  int height;
	  BathTub bathTub;
	 public BathRoom(int length, int width, int height, BathTub bathTub){
	   this.length = length;
	   this.width = width;
	   this.height = height;
	   this.bathTub = bathTub;
	 }
	 void getdata(){
		 System.out.println(bathTub.tubName);
		 System.out.println(length);
		 System.out.println(width);
		 System.out.println(height);
		 
		 
		
	 }
	 public  Object clone()throws CloneNotSupportedException
	 {
	 	return super.clone();
	 }
	 
		 
	 }
	/* public Object clone() {
	  try {
	   return (BathRoom)super.clone();
	 }
	  catch (CloneNotSupportedException e) {
	   System.out.println("CloneNotSupportedException comes out : "+e.getMessage());
	  }
	 }*/

	
public class Democlone2 {
	 public static void main(String[] args) throws CloneNotSupportedException
	 {
		   BathTub bathTub = new BathTub("BreezeTub");
		   BathRoom bathRoom1 = new BathRoom(10,10,12, bathTub);
		   System.out.println("original object");
		   bathRoom1.getdata();
		   BathRoom bathRoom2 = (BathRoom)bathRoom1.clone();
		   System.out.println("clonable object");
		   bathRoom2.getdata();
		  }

}
