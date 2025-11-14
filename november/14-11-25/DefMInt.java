interface int1
{
	default void m1()
	{
		//From java 9 version, default methods are allowed in interface, to write common code for everyclass if new functionality is added.

		System.out.println("Default method in interface, accessed by class");
	}
}
class Child implements int1
{
	public static void main(String args[])
	{
		Child child=new Child();
		child.m1();
	}
}
