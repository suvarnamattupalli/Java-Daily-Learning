class Toggle
{
	public static void main(String args[])
	{
		String s=new String("HeLlo alL");
		char[] c=s.toCharArray();

		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' && c[i]<='Z')
				c[i]=(char)(c[i]+32);

			else if(c[i]==' ')
				continue;

			else
				c[i]=(char)(c[i]-32);
		}
		System.out.println();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
	}
}

