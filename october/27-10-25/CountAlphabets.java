class CountAlphabets
{
	public static void main(String args[])
	{
		String s="aabbbddd";
		char[] c=s.toCharArray();
		int f=0,l=0,count=0;
		for(int x=0;x<s.length();x++)
		{
			f=s.indexOf(c[x]);
			l=s.lastIndexOf(c[x]);
			count=l-f+1;
			x=l;
			System.out.print(c[x]+""+count);
		}
	}
}
/*
a2b3d3
*/