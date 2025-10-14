class MinEle
{
	public static void main(String args[])
	{
		int[] a= new int[]{76,8,82,97,9};
		int min=a[0];
		for(int x=0;x<a.length;x++)
		{
			if(a[x]<min)
				min=a[x];
		}
		System.out.print("Min element: "+min);
	}
	  
	
}