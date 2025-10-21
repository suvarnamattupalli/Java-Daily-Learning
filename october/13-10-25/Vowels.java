class Vowels
{
	public static void main(String args[])
	{
		char[] ch=new char[]{'s','a','i','l'};
		Vowels v=new Vowels();

		System.out.println("Chararcter Array: ");
		for(char temp: ch)
			System.out.print(temp+" ");		
		
		System.out.println("\nVowels in Array: ");
		v.checkVowels(ch);
	}
	void checkVowels(char[] ch)
	{
		int count=0,i=0;
		for(i=0;i<ch.length;i++)
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
			{
				count++;
				System.out.print(ch[i]+" ");
			}
	}
	
}