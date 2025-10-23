class MemoryLiterals
{
	public static void main(String args[])
	{
		String s1="hello all";
		System.out.println("s1 "+s1+"-->"+System.identityHashCode(s1));//1 //scp

		String s2="hello ";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//2 //scp

		s2=s2+"all";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//3 //heap //concat creates a new obj in heap

		s2=s2.intern();
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//1 //scp //use intern() to map from heap to scp

		s2="hello all";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//1 //scp //re-assign makes to map in scp
	}

}
/*
s1 hello all-->798154996
s2 hello -->1418481495
s2 hello all-->135721597
s2 hello all-->798154996
s2 hello all-->798154996
*/