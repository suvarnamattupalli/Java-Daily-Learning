class Example
{
	int num;
	String name;
	Example(int num,String name)
	{
		System.out.print("Param");	
	}
	public static void main(String args[])
	{
		Example c=new Example();
	}
}
/*
Example.java:11: error: constructor Example in class Example cannot be applied to given types;
                Example c=new Example();
                          ^
  required: int,String
  found:    no arguments
  reason: actual and formal argument lists differ in length
1 error
*/