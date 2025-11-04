class Rev
{
	public static void main(String args[])
	{
		String s="good morning";
		String str[]=s.split(" ");
		String s2="";
		for(int i=0;i<str.length;i++)
		{
			String s1="";
			String word=str[i];
			for(int j=0;j<word.length();j++)
			{
				char c=word.charAt(j);
				s1=c+s1;
			}
			s2=s2+s1+" ";	
		}
		System.out.print(s2);
	}
}
//doog gninrom