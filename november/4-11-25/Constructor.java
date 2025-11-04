class Constructor
{
	int num;
	String name;
	Constructor()
	{
		this(10,"Suvarna");
		this.num=25;
		this.name="Kalyani";
	}
	Constructor(int num,String name)
	{
		this("Suvarna");
		this.num=num;
		this.name=name;
	}
	Constructor(String name)
	{
		this.name=name;
	}
	String printData()
	{
		return num+" "+name;
	}
	public static void main(String args[])
	{
		Constructor c=new Constructor();
		System.out.println(c.printData());
	}
}