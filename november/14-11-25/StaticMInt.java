interface int1
{
	static void m1()
	{
		System.out.println("Static method in Interface, accessed by interface name");
	}
	//void m2();
}
class Child implements int1
{
	public static void main(String args[])
	{
		Child child= new Child();
		int1.m1();
	}
	/*public void m2()
	{

	}*/
}