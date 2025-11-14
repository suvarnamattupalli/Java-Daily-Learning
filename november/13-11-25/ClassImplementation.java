interface Connection
{
	 void m1();
	 void m2();
}
class ConnectionImp implements Connection
{
	public static void main(String args[])
	{
		Connection c= new ConnectionImp();
		c.m1();
		c.m2();
		//c.m3(); //error: cannot find symbol - bcoz ref from interface which doesnt have m3
	}
	public void m1()
	{
		System.out.println("Method1");
	}
	public void m2()
	{
		System.out.println("Method2");
	}
	public void m3()
	{
		System.out.println("Method3");
	}
}