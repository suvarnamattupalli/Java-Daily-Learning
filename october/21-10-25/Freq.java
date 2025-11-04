class Freq
{
	public static void main(String args[])
	{
		String s="hello all good morning";
		char[] c=s.toCharArray();
		boolean[] b=new boolean[c.length];
		int[] freq=new int[b.length];
		int count=0,rep=0,x=0;
		for(int i=0;i<c.length;i++)
		{
			if(b[i] || c[i]==' ')
				continue;
			count=0;
			for(int j=i;j<c.length-1;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					b[j]=true;
				}
			}
			freq[i]=count;
			if(count>rep)
			{
				rep=count;
				System.out.print(rep);
			}
			/*for(int y=0;y<freq.length;y++)
			{
				if(freq[y]==rep)
					//System.out.print(c[x]+" repeated "+rep+" times.");
					
			}*/
		}
	}
}