class VowCon
{
	public static void main(String args[])
	{
		char[] ch=new char[]{'a','e','B','o','g','I'};
		int vow=0,con=0;
		for(int x=0;x<ch.length;x++)
		{
			if(ch[x]=='a' || ch[x]=='e' || ch[x]=='i' || ch[x]=='o' || ch[x]=='u' || ch[x]=='A' || ch[x]=='E' || ch[x]=='I' || ch[x]=='O' || ch[x]=='U')
				vow++;
			else
				con++;
		}
		System.out.println("No of Vowels: "+vow);
		System.out.println("No of Consonants: "+con);	
	}
}