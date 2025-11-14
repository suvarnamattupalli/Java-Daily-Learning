class UpCasting
{
	public static void main(String args[])
	{
		Parent p=new Child();
		System.out.println(p.m1());
		System.out.println(p.m2());
		System.out.println(p.m3()); //m3 will not be compiled bcoz the ref var belongs to Parent and there is no m3 in Parent.
	}
}
class Parent
{
	String m1()
	{
		return "Parent M1";
	}
	String m2()
	{
		return "Parent M2";
	}

}
class Child extends Parent
{
	String m2()
	{
		return "Child M2";
	}
	String m3()
	{
		return "Child M3";
	}
}