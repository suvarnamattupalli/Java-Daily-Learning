class EvenAdj
{
	public static void main(String args[])
	{
		String s="hello all good morning everyone";
		String str[]=s.split(" ");
		String word="";
		String s1="";
		int x=0;
		for(int i=0;i<str.length;i++)
		{
			word=str[i];
			if(word.length()%2!=0)
			{
				s1=s1+word+" ";
			}
			else
			{
				char[] c1=word.toCharArray();
				String s2="";
				for(x=0;x<word.length()/2;x+=2)
				{
					 char c=c1[x];
					c1[x]=c1[x+1];
					c1[x+1]=c;
				}
				for(char temp:c1)
					s2=s2+temp;
				s1=s1+s2+"";
			}
			s1=s1+" ";
		}
		System.out.print(s1);
	}
}

//hello  all  ogod morning  vereyone