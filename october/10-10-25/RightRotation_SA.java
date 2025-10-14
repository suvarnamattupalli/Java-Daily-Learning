class RightRotation_SA
{
	public static void main(String args[])
	{
		int[] a=new int[]{10,20,30,40,50};

		System.out.println("Original Array");
		for(int temp1: a)
			System.out.print(temp1+" ");
		int r=2;
		for(int i=1;i<=r;i++)
		{
			int copy=a[a.length-1];
			for(int x=a.length-1;x>0;x--)
				a[x]=a[x-1];
			a[0]=copy;
		}

		System.out.println("\nRight Rotated Array");
		for(int temp2: a)
			System.out.print(temp2+" ");

	}
}