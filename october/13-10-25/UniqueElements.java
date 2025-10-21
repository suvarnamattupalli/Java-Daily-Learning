class UniqueElements
{
	public static void main(String args[])
	{
		int[] a= new int[]{10,80,20,20,20};
		boolean[] b=new boolean[a.length];
		int count;
		for(int i=0;i<a.length;i++)
		{	
			count=0;
			if(b[i])
				continue;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=true;
				}		
			}
			if(count==0)
				System.out.print(a[i]+" ");	
		}
	}
}