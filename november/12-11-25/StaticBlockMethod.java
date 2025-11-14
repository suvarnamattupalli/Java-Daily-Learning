class SBlockMethod
{
	static int x=10;
	public static void main(String args[])
	{
		System.out.println(x);

		m1(); 		//Static method need to be called explicitly

		System.out.println(x);

	}
	static			//Static BLOCK will be exec implicitly.
	{
		x=100;
		System.out.println("Static Block");
	}
	static void m1()
	{
		x=1000;
		System.out.println("Static Method");
	}
}


