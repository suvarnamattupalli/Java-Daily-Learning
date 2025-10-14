class CharArray
{ 	
	public static void main(String a[])
	{
		int num=0,symbols=0,space=0,uc=0,lc=0;
		char[] ch = new char[]{'x','^','9','Y','T','@'};
		for(int x=0;x<ch.length;x++)
		{
			if(ch[x]>='0' && ch[x]<='9')
			{
				num++;
			}
			else if(ch[x]>='A' && ch[x]<='Z')
			{
				uc++;
			}
			else if(ch[x]>='a' && ch[x]<='z')
			{
				lc++;
			}
			else if(ch[x]==' ')
			{
				space++;
			}
			else
			{
				symbols++;
			}
		}
		System.out.println("Uppercase: "+uc);
		System.out.println("Lowecase: "+lc);
		System.out.println("Numbers: "+num);
		System.out.println("Space: "+space);
		System.out.println("Symbols: "+symbols);	
	}
}
