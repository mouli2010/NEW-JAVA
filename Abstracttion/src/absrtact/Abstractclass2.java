package absrtact;
abstract class Bike
{
	abstract void run();
	void changeGear()
	{
		System.out.println("gear changed");
		} 
}
class Honda extends Bike

{
void run()
{
	System.out.println("running safely");
}
}
class Avengers extends Bike

{
void run()
{
	System.out.println("running riskly");
}
}
	public class Abstractclass2 {


	public static void main(String[] args) {
		Bike b;
		b=new Honda();
		b.run();
		b=new Avengers();
		b.run();
		b.changeGear();

	}

}
