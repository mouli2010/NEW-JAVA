package constructor;

public class Passbyvalue {

	public static void main(String[] args) {
		int n=20;
		int n1=40;
		System.out.println(n+"\t"+n1);
		swap(n,n1);
		System.out.println(n+"\t"+n1);

	}
	static void swap(int n,int n1)
	{
		int temp=0;
		temp=n;
		n=n1;
		n1=temp;
		//System.out.println(n+"\t"+n1);
	}

}
