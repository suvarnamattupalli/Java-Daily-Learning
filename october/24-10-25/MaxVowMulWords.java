class MaxVowMulWords
{
	public static void main(String args[])
	{
		String s="madam arora teaches malyalam";
		String[] str=s.split(" ");
		int count=0,max=0;
		String maxWord="";
		for(int i=0;i<str.length;i++)
		{
			count=0;
			System.out.print(str[i]+"--->");
			char c[]=str[i].toCharArray();
			for(int j=0;j<c.length;j++)
			{
			
				if(c[j]=='a' || c[j]=='e' || c[j]=='i' || c[j]=='o' || c[j]=='u')
				{
				System.out.print(c[j]+ " ");
				count++;
				}
			}
			System.out.println();
			if(count>=max)
			{
				if(count>max)
				{
					max=count;
					maxWord=str[i]+" ";
				}
				else //if same or equal count - to print multiple words we concat.
				{
					max=count;
					maxWord=maxWord+str[i]+" ";
				}
			}
		}
		System.out.println("\nMax Vowels in "+maxWord);
	}
}
/*

madam--->a a
arora--->a o a
teaches--->e a e
malyalam--->a a a

Max Vowels in arora teaches malyalam

*/