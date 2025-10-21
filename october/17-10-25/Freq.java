class Freq
{
	public static void main(String args[])
	{
		String s=new String("HeLlo alL");
		char[] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		int count=0;

		for(int i=0;i<c.length;i++)
		{
			if(b[i])
				continue;
			count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==' ')
					continue;
				if(c[i]==c[j])
				{
					
					count++;
					b[j]=true;
				}
			}
		if(count>0)
		System.out.println(c[i]+" "+count);
		}
	}
}

