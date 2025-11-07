class ParentMethod
{
	public static void main(String args[])
	{
		Child child=new Child(21,"Suvarna");
		System.out.println(child.printInfo());
		//System.out.println(child.printInfo()); //We cannot access parent class method like this if both has same methodname & datatype
		System.out.println(child.printInt()); //If diff method then we can access like this.
	}
}
class Child extends Parent
{
	int age;
	String name;
	Child(int age,String name)
	{
		super("9");
		this.age=age;
		this.name=name;
	}
	String printInfo()
	{
		System.out.println(super.printInfo()); //We need to use super.method();
		return age+" "+name;
	}
}
class Parent
{
	String id;
	Parent(String id)
	{
		this.id=id;
	}
	String printInfo()
	{
		return id;
	}
	int i;
	int printInt()
	{
		return 5;
	}
}
