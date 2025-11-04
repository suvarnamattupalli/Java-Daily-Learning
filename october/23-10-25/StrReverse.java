class StrReverse
{
	public static void main(String args[])
	{
		String s="hello all";
		char[] c=s.toCharArray();
		String res="";
		for(int x=c.length-1;x>=0;x--)
		{
			res=res+c[x];
		}
		System.out.print(res);
	}
}