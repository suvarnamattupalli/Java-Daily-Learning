class VowelWord
{
	public static void main(String[] args) 
	{
		String s="vital info resource under seize";
		String str[]=s.split(" ");
		for(int i=0;i<str.length;i++)
       		{
			char[] word=str[i].toCharArray();
			System.out.println(str[i]);
			for(int j=0;j<str[i].length();j++)
			{
				if(word[j]=='a' || word[j]=='e' || word[j]=='i' || word[j]=='o' || word[j]=='u')
					System.out.println(word[j]);
			}
			System.out.println();
		}
	}
}	

/*
vital
i
a

info
i
o

resource
e
o
u
e

under
u
e

seize
e
i
e
*/