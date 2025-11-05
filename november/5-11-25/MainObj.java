class MainObj
{
	public static void main(String args[])
	{
		Child child=new Child();	//Create object for child class,so we can access both class prop & beh
		System.out.println(child.printInfo());
	}
}
class Child extends Parent
{
	//Default constructor is present
}
class Parent
{
	double height;
	String color;
	Parent()	//when obj created for child class,def child & parent class cons both will be exec.
	{
		height=5.7;
		color="ABC";
	}
	String printInfo()
	{
		return height+" "+color;
	}
}