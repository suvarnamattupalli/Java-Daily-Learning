class PrintAlphabets
{
	public static void main(String args[])
	{
		String s="a1b2c3d4&7";
		int x=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
				if(Character.isDigit(ch[i]+1))
				{
					x=Character.getNumericValue(ch[i]+1);
					for(int j=0;j<x-1;j++)
					{
						int y=i-1;
						System.out.print(ch[y]);
					}
				}
		}
	}
}