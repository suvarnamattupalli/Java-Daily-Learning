class MostRepeated
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		char[] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		int count=0,rep=0;
		int freq[] = new int[b.length];
		for(int i=0;i<c.length;i++)
		{
			if(b[i] || c[i]==' ')
				continue;
			count=0;
			for(int j=i;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					b[j]=true; 
					count++;
				}
			}
			freq[i]=count;	
			if(count>rep)
			{
				rep=count;

			}
		}
		for(int y=0;y<c.length;y++)
		{
			if(freq[y]==rep)
				System.out.println(c[y]);
		}
	}
}