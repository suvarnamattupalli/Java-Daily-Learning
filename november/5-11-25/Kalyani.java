class Child extends Kalyani
{
	public static void main(String args[])
	{
		Child child=new Child();
		Child child2=new Child(1);
		Child child3=new Child(2);
		System.out.println(child.printData());
		System.out.println(child2.printData());
	}
	Child()
	{
		super(4,"Bruno");
	}
	Child(int x)
	{
		super(5,"max");
	}	
}
class Kalyani
{
	int height;
	String name;
	Kalyani(int height,String name)
	{
		this.height=height;
		this.name=name;
	}
	String printData()
	{
		return height+" "+name;
	}
}