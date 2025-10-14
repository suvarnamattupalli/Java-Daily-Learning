class UppLow
{
	public static void main(String args[])
	{
		char[] ch= new char[]{'a','g','H','u','K','P'};
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]+" ");
		}
		System.out.println("\n Replace LowerCase with Prev Char & UpperCase with Next Char: ");
		for(int x=0;x<ch.length;x++)
		{
			if(ch[x]>='a' && ch[x]<='z')
				System.out.print((char)(ch[x]-1)+" ");
			else if(ch[x]>='A' && ch[x]<='Z')
				System.out.print((char)(ch[x]+1)+" ");
		}
	}
}