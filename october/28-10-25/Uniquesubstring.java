class Uniquesubstring
{
	public static void main(String args[])
	{
		String s="hello",s1="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				s1=s.substring(i,j);
				String s2="";
				for(int x=0;x<s1.length();x++)
				{
					char c=s1.charAt(x);
					if(s1.indexOf(c)!=s1.lastIndexOf(c))
					{
						if(s2.indexOf(c)==-1)
						{
							s2+=c;
							break;
						
						}		
					}
				}
				if(s2.length()==0)
					System.out.println(s1);
			}
		}
		
	}

}

/*
h
he
hel
e
el
l
l
lo
o
*/