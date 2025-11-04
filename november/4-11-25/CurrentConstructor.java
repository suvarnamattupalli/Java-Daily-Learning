class CurrentConstructor
{
	int num;
	CurrentConstructor()
	{
		//this();	//error: recursive constructor invocation
		this(10);
		System.out.println("I am Default Constructor");
		//this(10);	// error: call to this must be first statement in constructor
	}

	CurrentConstructor(int num)
	{
		System.out.println("I am One Parameterised Constructor");
	}
	public static void main(String args[])
	{
		CurrentConstructor cc=new CurrentConstructor();
	}
}