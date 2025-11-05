class ChildS extends Parent
{
	ChildS()
	{
		super(23);	//Calls parent param cons
		System.out.println("Child Def");
	}
	public static void main(String args[])
	{
		ChildS childs=new ChildS();
	}
}
class Parent
{
	Parent(int x)
	{
		System.out.println("Parent Param");
	}
}