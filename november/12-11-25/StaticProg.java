class StaticProg
{
	static int x=5;
	public static void main(String args[])
	{
		
	}
	static
	{	//static void method()//We cannot write methods but we can implement programs directly in static
		{
		if(x%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		}
	}
}

//Odd Number