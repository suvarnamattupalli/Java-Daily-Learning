class StaticVar
{
	static int x;
	int y;
	public static void main(String args[])
	{
		
	}
	static
	{
		x=20;	//We should only declare static var in static block								
		y=90;
		System.out.println(x+" "+y);
	}
}
/*
StaticVar.java:12: error: non-static variable y cannot be referenced from a static context
                y=90;
                ^
StaticVar.java:13: error: non-static variable y cannot be referenced from a static context
                System.out.println(x+" "+y);
                                         ^
2 errors
*/