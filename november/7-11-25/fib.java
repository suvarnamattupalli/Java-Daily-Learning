class fib
{
	public static void main(String args[])
	{
	int[] a=new int[]{15,8,10};
	for(int i=0;i<a.length;i++)
	{
		int f=0,s=1,t=0;
		for(int j=0;j<a[i];j++)
		{
			System.out.print(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println();
	}
	}
}