package loops;

public class Twod {

	public static void main(String[] args) {
		
		int x[][]={{0,20,35},{23,24,56}};
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<2;j++)
			{
				System.out.print(x[j][i]+"\t");
			}
			System.out.println();
		}

	}

}
