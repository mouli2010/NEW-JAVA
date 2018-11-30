package oops;
class Animal
{
	String name;
	int legs;
	String addr;
	public void getanimaldetails()
	{
		System.out.println("animal name:"+name);
		System.out.println("animal legs:"+legs);
		System.out.println("animal address:"+addr);
	}
	public void eat()
	{
		System.out.println("eating");
	}
	void bark()
	{
		System.out.println("barking");
     } 
	public void hunt()
	{
		System.out.println("hunting");
	}
}
class Dog extends Animal
{
	Dog(String name,int legs,String addr)
	{
		this.name=name;
		this.legs=legs;
		this.addr=addr;
	}
	public void getdogdetails()
	{
		System.out.println("dog details");
		System.out.println("----------");
		getanimaldetails();
		eat();
		bark();
		
	}
}
class Cat extends Animal
{
	Cat(String name,int legs,String addr)
	{
		this.name=name;
		this.legs=legs;
		this.addr=addr;
	}
	public void getcatdetails()
	{
		System.out.println("cat details");
		System.out.println("----------");
		getanimaldetails();
		eat();
		bark();
	}
}
class Lion extends Animal
{
	Lion(String name,int legs,String addr)
	{
		this.name=name;
		this.legs=legs;
		this.addr=addr;
	}
	public void getliondetails()
	{
		System.out.println("lion details");
		System.out.println("----------");
		getanimaldetails();
		eat();
		bark();
		hunt();
	}
}
class Tiger extends Animal
{
	Tiger(String name,int legs,String addr)
	{
		this.name=name;
		this.legs=legs;
		this.addr=addr;
	}
	public void gettigerdetails()
	{
		System.out.println("tiger  details");
		System.out.println("----------");
		getanimaldetails();
		eat();
		bark();
		hunt();
	}
}
public class Inheritance {

	public static void main(String[] args) {
		Dog d=new Dog("dog",4,"house");
		d.getdogdetails();
		System.out.println();
		Cat c=new Cat("cat",4,"house");
		c.getcatdetails();
		System.out.println();
		Lion l=new Lion("lion",4,"forest");
		l.getliondetails();
		System.out.println();
	    Tiger t=new Tiger("tiger",4,"forest");
		t.gettigerdetails();
		System.out.println();

	}

}
