class Child extends Father//now we can acccess Father class inst var & methods
{
	
}
class Father
{
	double height;
	String other_prop;
}
class Inheritance
{
	public static void main(String args[])
	{
		Child child=new Child();
		child.height=5;
	}
}