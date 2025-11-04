class SecMax
{
	public static void main(String args[])
	{
		String s="Hello all Good Morning";
		String str[]=s.split(" ");
		String word="",s1="",s2="";
		int max1=Integer.MIN_VALUE,max2=max1;
		for(int i=0;i<str.length;i++)
		{
			word=str[i];
			if(word.length()>max1)
			{
				max2=max1;
				s2=s1;
				max1=word.length();
				s1=word;
			}
			else if(word.length()>max2 && word.length()<max1)
			{
				max2=word.length();
				s2=word;
			}	
		}
		System.out.println(s2);
	}
}
//Hello