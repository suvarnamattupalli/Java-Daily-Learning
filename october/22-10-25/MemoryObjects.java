class MemoryObjects
{
	public static void main(String args[])
	{
		String s1=new String("hello all");
		System.out.println("s1 "+s1+"-->"+System.identityHashCode(s1));//1 //heap

		String s2= new String("hello ");
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//2 //heap

		s2=s2+"all";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//3 //heap //concat creates a new obj in heap

		s2=s2.intern();
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//4 //scp //use intern() to map from heap to scp //bcoz no mem in scp

		s2="hello all";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//4 //scp //re-assign makes to map in scp
	}

}