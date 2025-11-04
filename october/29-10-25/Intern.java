class Intern
{
	public static void main(String args[])
	{
		String s1="hello";//literal //one memory in scp

		String s2=new String("hi"); //object //two memories,in scp and heap
		String s3=new String("hello");
		String s4=new String("hi");
	
		s2=s2.intern();
		s3=s3.intern();
		s4=s4.intern();
		System.out.println(s1+" "+System.identityHashCode(s1));//1
		System.out.println(s2+" "+System.identityHashCode(s2));//2
		System.out.println(s3+" "+System.identityHashCode(s3));//1
		System.out.println(s4+" "+System.identityHashCode(s4));//2
	}
}