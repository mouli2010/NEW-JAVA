package oopss;

class Animal1 
{ 
    public void callme()
    {
        System.out.println("In callme of Animal");
    }
}


class Dog1 extends Animal1 
{ 
    public void callme()
    {
        System.out.println("In callme of Dog");
    }

    public void callme2()
    {
        System.out.println("In callme2 of Dog");
    }
}

public class UseAnimals
{
    public static void main (String [] args) 
    {
        Dog1 d = new Dog1();      
       Animal1 a = (Animal1)d;
        d.callme();
        a.callme();
        ((Dog1) a).callme2();
    }
}
