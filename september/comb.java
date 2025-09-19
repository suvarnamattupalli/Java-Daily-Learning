class comb
{
	public static void main(String args[])
	{
		int n=8,r=3,c=0,n_fact=1,r_fact=1,c_fact=1;
		c=n-r;
		for(int start=1;start<=n;start++)
		{
			n_fact*=start;
		}
		for(int start=1;start<=r;start++)
		{
			r_fact*=start;
		}
		for(int start=1;start<=c;start++)
		{
			c_fact*=start;
		}
		System.out.println(n_fact/(r_fact*c_fact));
	}
}