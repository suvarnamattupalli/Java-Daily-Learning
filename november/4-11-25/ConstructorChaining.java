class ConstructorChaining
{
	int num;
	String name;
	ConstructorChaining()
	{
		this(10);	//Only one constructor should be called in a Constructor

		//this(10,"Hello"); // error: call to this must be first statement in constructor

		System.out.println("I am Default Constructor");
	}
	ConstructorChaining(int num)
	{
		this(10,"Hello");
		System.out.println("I am One Parameterised Constructor");
	}
	ConstructorChaining(int num,String name)
	{
		System.out.println("I am Two Parameterised Constructor");
	}
	public static void main(String args[])
	{
		ConstructorChaining cc=new ConstructorChaining();
	}
}