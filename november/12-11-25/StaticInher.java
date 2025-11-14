class StaticInher
{
	//public static void main(String args[])
	{
		//Need to create obj to exec static block in ChildClass(or forcefully load it)
	}
	static
	{
		System.out.println("Parent");
	}
	
}
class Child extends StaticInher
{
	//public static void main(String args[])
	{
	}
	static
	{
		System.out.println("Child");
	}
}

/*
java StaticInher //if i use this cmd and mainM in parent then i need to create obj to exec child.
-->Parent

java Child //if i use this cmd and mainM in child then no need of obj, superclass will be called implicitly.
-->Parent
Child

*/