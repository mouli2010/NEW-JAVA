package constructor;

class Teacher{
	public static void mtd(int arr[]){
		System.out.println("before");
		for (int i : arr) {
		System.out.println(i);
		}
		arr[2]=60;
		System.out.println("after");
		for (int i : arr) {
			System.out.println(i);
		}
	}
}
public class PassByReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={10,20,30};
Teacher.mtd(arr);
System.out.println("after method operation");
for (int i : arr) {
	System.out.println(i);
}
	}

}
