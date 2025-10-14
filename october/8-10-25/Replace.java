class Replace
{
	public static void main(String args[])
	{
		char[] ch= new char[]{'a','!','9','^','*','P'};
		System.out.println("Char Array: ");
		for(int x=0;x<ch.length;x++)
		{
			System.out.print(ch[x]);		
		}
		System.out.println("\nReplace Symbols with % : ");
		for(int x=0;x<ch.length;x++)
		{
			if(!(ch[x]>='a' && ch[x]<='z' || ch[x]>='A' && ch[x]<='Z' || ch[x]>='0' && ch[x]<='9' || ch[x]==' '))
				System.out.print("% ");
			else
				System.out.print(ch[x]+" ");
		}
	}
}

/*Output
Char Array:
a!9^*P
Replace Symbols with % :
a % 9 % % P
*/