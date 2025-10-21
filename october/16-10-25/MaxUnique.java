class MaxUnique
{
	public static void main(String args[])
	{
		int[] a= new int[]{10,80,20,40,20};
		boolean[] b=new boolean[a.length];
		int count=0;
		int max=Integer.MIN_VALUE;
		System.out.print("Unique elements: ");
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
			{
			System.out.print(a[i]+" ");
			if(a[i]>max)
				max=a[i];
			}
		}
		System.out.print("\nMax element: "+max);
	
	}
}
/*Output
Unique elements: 10 80 40
Max element: 80
*/ 