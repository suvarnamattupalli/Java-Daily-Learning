class Main
{
	public static void main(String args[])
	{
		One o=new One();
		o.oneMethod(); //this method belongs to One Class,we decide it based on the object we use to call this method

		Two t=new Two();
		t.twoMethod(); //this method belongs to Two Class
	}
}
class One
{
	void oneMethod()
	{
		System.out.println("This is from class one");
	}	
}
class Two
{
	void twoMethod()
	{
		System.out.println("This is from class two");
	}
}