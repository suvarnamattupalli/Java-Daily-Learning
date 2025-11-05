class ParentInstVar
{
	public static void main(String args[])
	{
		Child child=new Child();
		System.out.println(child.printData());
	}
}
class Child extends Parent
{
	int x,y;
	Child()
	{
		x=10;y=20;
	}
	String printData()
	{
		return super.x+" "+super.y+" "+this.x+" "+this.y;
	}
}
class Parent
{
	int x,y;
	Parent()
	{
		x=100;y=200;
	}

}

//100 200 10 20