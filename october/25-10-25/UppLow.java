class UppLow
{
	public static void main(String args[])
	{
		String s1="AppLe";
		String s2="";
		char[] c=s1.toCharArray();
		
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A' & c[i]<='Z') //upp-->lowcase
				c[i]=(char)(c[i]+32);
			else if(c[i]>='a' & c[i]<='z') //low-->uppcase
				c[i]=(char)(c[i]-32);
			else
				c[i]=c[i];
			s2=s2+c[i];	
		}
		System.out.print(s2);		
	}
}

/*
aPPlE
*/