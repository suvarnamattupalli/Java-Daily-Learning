class Memory
{
	public static void main(String args[])
	{
		System.out.println("Literals:");

		String s1="Hello";
		System.out.println("s1 "+s1+"-->"+System.identityHashCode(s1));//1 //scp
		String s2="Hello";
		System.out.println("s2 "+s2+"-->"+System.identityHashCode(s2));//1 //scp
		String s3="Hi";
		System.out.println("s3 "+s3+"-->"+System.identityHashCode(s3));//2 //scp
		s1="Hi";
		System.out.println("s1 "+s1+"-->"+System.identityHashCode(s1));//2 //scp
		

		System.out.println("Objects:");

		String s4=new String("Hello");
		System.out.println("s4 "+s4+"-->"+System.identityHashCode(s4));//3 //heap
		String s5=new String("Hello");
		System.out.println("s5 "+s5+"-->"+System.identityHashCode(s5));//4 //heap

		String s6=new String("Hi");
		System.out.println("s6 "+s6+"-->"+System.identityHashCode(s6));//5 //heap

		s4="Hi";
		System.out.println("s4 "+s4+"-->"+System.identityHashCode(s4));//2 //re assigned to scp literal

		String s7=new String("Hel");	
		System.out.println("s7 "+s7+"-->"+System.identityHashCode(s7));//6 //heap

		s7=s7+"lo";
		System.out.println("s7 "+s7+"-->"+System.identityHashCode(s7));//7 //heap
	}

}

/*
Literals:
s1 Hello-->798154996
s2 Hello-->798154996
s3 Hi-->1418481495
s1 Hi-->1418481495
Objects:
s4 Hello-->303563356
s5 Hello-->135721597
s6 Hi-->142257191
s4 Hi-->1418481495
s7 Hel-->1044036744
s7 Hello-->1406718218
*/
