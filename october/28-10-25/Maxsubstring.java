class Maxsubstring
{
	public static void main(String args[])
	{
		String s="abc";
		String s1="",s2="";
		int max=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				s1=s.substring(i,j);
			}
			if(s1.length()>max)
			{
				max=s1.length();
				s2=s1;
			}
		}
		System.out.print("Max substring: "+s2+" & its length - "+max);
	}
}
/*
Max substring: abc & its length - 3
*/