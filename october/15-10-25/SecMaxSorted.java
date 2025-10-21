class SecMaxSorted
{
	public static void main(String args[])
	{
		int[] a=new int[]{100,100,90,90,90,80,40};
		int count=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1]) //checks for duplicate elements
			{
				count++;
				if(count==2)
				{
					System.out.print(a[i]);
					break;
				}
			}
		}
	}
}