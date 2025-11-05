class Sub extends Sup
{
	Sub()
	{
		// super(); by default calls
		System.out.println("Def subclass"); 
	}
	Sub(int x)
	{
		// super(); by default calls
		System.out.println("Param subclass");
	}
	public static void main(String args[])
	{
		Sub sub=new Sub();
		Sub sub2=new Sub(10);
	}
}
class Sup
{
	Sup()
	{
		System.out.println("Def superclass");	
	}
	Sup(int x)
	{
		System.out.println("Param superclass");	//not executed, we need to call as super(10);, then it gets exec.

	}
}

/*
Def superclass
Def subclass
Def superclass
Param subclass
*/