class Specific
{
	public static void main(String args[])
	{
		String s= new String("Programming");
		char[] c=s.toCharArray();
		char x='a';
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==x)
				System.out.print(c[i]+" "+i);
		}
	}
}