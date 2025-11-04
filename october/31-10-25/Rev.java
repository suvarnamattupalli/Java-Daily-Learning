class Rev
{
	public static void main(String[] args)
	{
		String s="Coding";
		char[] c=s.toCharArray();
		String s1="";
		for(int i=0;i<c.length;i++)
		{
			s1=c[i]+s1;
		}	
		System.out.print(s1);
	}
}