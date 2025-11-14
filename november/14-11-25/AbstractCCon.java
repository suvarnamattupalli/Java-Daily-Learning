class Main
{
	public static void main(String args[])
	{
		Child child=new Child();	//Child class object
	}
}
abstract class Parent
{
	//abstract void m1(); ->in future if we want we can create abstract method,so we can define a class as abs in this case.
	Parent()
	{
		System.out.println("Parent Constructor");
	}
}
class Child extends Parent
{
	Child()		//Child Constrcutor calls super class default Cons implicitly.
	{
		System.out.println("Child Constructor");
	}
}