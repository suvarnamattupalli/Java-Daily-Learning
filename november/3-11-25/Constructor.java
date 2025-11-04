class Constructor
{
	public static void main(String args[])
	{
		
		Demo demo=new Demo(101);
		Demo demo1=new Demo(10,12);
		
	}	
}
class Demo
{
	Demo(int x)
	{
		
		System.out.println("Integer "+ x);
	}
	Demo(int x,float y)
	{
		System.out.println("Integer "+ x +" & float " +y);
	}
}