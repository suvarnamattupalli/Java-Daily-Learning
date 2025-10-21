class Swap
{
	public static void main(String args[])
	{
		String s=new String("hello");
		char[] c=s.toCharArray();
		String x="";
		x=x+c[c.length-1];
		for(int i=0;i<c.length-2;i++)
		{
			x=x+c[i+1];		
		}
		x=x+c[0];
		System.out.print(x);
	}
}