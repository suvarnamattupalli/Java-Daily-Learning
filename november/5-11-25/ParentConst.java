class ParentConst
{
	public static void main(String args[])
	{
		Child child = new Child();
	}
}
class Child extends Parent
{
	//Even not written there is a def cons "Child(){}",
		// And in every ChildClass Cons there is a constructor call implicitly "super()";
}
class Parent
{
	Parent()
	{
		System.out.print("Parent Class Default Constructor");
	}
}