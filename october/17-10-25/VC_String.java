class VC_String
{
	public static void main(String args[])
	{
		String s=new String("hello all");
		char[] c=s.toCharArray();
		int vow=0,con=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u' || c[i]=='A' || c[i]=='E' || c[i]=='I' || c[i]=='O' || c[i]=='U')
				vow++;
			else if(c[i]==' ')
				continue;
			else
				con++;
		}
		System.out.println("Vowels: "+vow);
		System.out.println("Consonants: "+con);
	}
}

