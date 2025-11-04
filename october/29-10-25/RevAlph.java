class RevAlph
{
	public static void main(String args[])
	{
		String s="am-a-n&ap*la$n";
		//output: na-l-p&an*am$a
		char[] c1=s.toCharArray();
		char[] c2=s.toCharArray();
		char temp=' '; 
		int j=c2.length-1;
		for(int i=0;i<c1.length;i++)
		{
			if(Character.isLetter(c1[i]))
			{
				while(j>=0 && !Character.isLetter(c2[j]))
				{
					j--;
				}
				c1[i]=c2[j];
				j--;
			}
		}
		for(char temp2: c1)
			System.out.print(temp2);		
	}
}