class Prime
{
	public static void main(String args[])
	{
		int[] a= new int[]{2,3,4,5,6};
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count=0;
			for(int j=2;j<=a[i]/2;j++)
			{
				if(a[i]%j==0)
				{
					count++;
				}
			}
			if(count==0)
				System.out.print(a[i]);
		}
	}
}