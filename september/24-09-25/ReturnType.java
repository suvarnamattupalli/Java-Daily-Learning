class ReturnType
{ 	
	public static void main(String args[])
	{
		Sample sample=new Sample();
		int i=sample.isInt();
		String str=sample.isString();
		boolean b=sample.isBoolean();
		char c=sample.isChar();
		char ch=sample.isChar2();
		System.out.println(i+" "+str+" "+b+" "+c+" "+ch);
		sample.noReturn();
	}
}
class Sample
{
	int isInt()
	{
		return 67;
	}
	String isString()
	{
		return "String";
	}
	boolean isBoolean()
	{
		return true;
	}
	char isChar()
	{
		return 67;
	}
	char isChar2()
	{
		System.out.println('S');
		return 'Z';
		
	}
	void noReturn()
	{
		System.out.print("No ReturnType");
		return;
	}	
}
/*Output
S
67 String true C Z
No ReturnType*/

