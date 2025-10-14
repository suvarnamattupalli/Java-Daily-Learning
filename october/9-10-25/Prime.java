class Prime
{
	int[] checkPrime(int[] a,int[] b)
	{
		for(int x=0;x<a.length;x++)
		{
			int count=0;
			for(int j=2; j<=a[x]/2;j++)
			{
				if(a[x]%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0)
				b[x]=1;
			else
				b[x]=0;
		}
		return b;
	}
	public static void main(String args[])
	{
		Prime p=new Prime();
		int[] arr=new int[]{8,7,4,5,1,3,6};
		int[] b=new int[arr.length];
		int[] c=p.checkPrime(arr,b);
		
		for(int x=0;x<c.length;x++)
		{
			if(c[x]==1)
				System.out.print(arr[x]+"\t");
		}
	}

}