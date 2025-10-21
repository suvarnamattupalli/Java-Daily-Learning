class NSLU
{
	public static void main(String args[])
	{
		String s=new String("Today Date is 17-10-2025");
		char[] c=s.toCharArray();
		int num=0,sym=0,uc=0,lc=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
				num++;
			else if(c[i]==' ')
				continue;
			else if(c[i]>='A' && c[i]<='Z')
				uc++;
			else if(c[i]>='a' && c[i]<='z')
				lc++;
			else
				sym++;
		}
		System.out.println("Numbers: "+num);
		System.out.println("LowerCase: "+lc);
		System.out.println("UpperCase: "+uc);
		System.out.println("Symbols: "+sym);
	}
}

