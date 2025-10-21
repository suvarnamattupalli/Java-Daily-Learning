class FreqElements
{
	public static void main(String args[])
	{
		int[] a= new int[]{1,2,3,4,2,6,7,4,2};
		boolean[] b=new boolean[a.length];
		int count;
		for(int i=0;i<a.length;i++)
		{	
			if(b[i])
				continue;
			count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}
					
			}
			System.out.println(a[i]+" "+count);
				
		}
	}
	
}