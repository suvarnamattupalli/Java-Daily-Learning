class Parent
{
	static void m1()
	{
		System.out.println("Parent Static");
	}
}
class Child extends Parent
{
	public static void main(String args[])
	{
		//m1();
		//Parent.m1();
		//Child child=new Child();
		Parent parent=new Child();
		parent.m1();
			
	}
	static void m1()
	{
		System.out.println("Child Static");
	}
}