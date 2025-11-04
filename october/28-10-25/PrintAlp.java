class PrintAlp
{
	public static void main(String args[])
	{
		PrintAlp a=new PrintAlp();
		a.singleChar();
		a.multipleChar();
	}	
	void singleChar()
	{
		String s="A11B12C13";
		char[] c=s.toCharArray();
		int num=0;
		char ch=' ';
		for(int i=0;i<c.length;i++)//0<9 //1<9 //2<9 //3<9 //4<9 //5<9 //6<9 //7<9 //8<9 
		{
			if(Character.isDigit(c[i]))//A //1 //1//B //1 //2 //C //1 //3
			{
				num=num*10+Character.getNumericValue(c[i]);// 0*10+1=1 //1*10+1=11 //0*10+1=1 //1*10+2=12 //0*10+1=1 //1*10+3=13
				if(i==s.length()-1)//8==8
				{
					for(int j=0;j<num;j++) //13
					{
						System.out.print(ch); //CCCCCCCCCCCCC
					}
				}
			}
			else 
			{
				
				for(int j=0;j<num;j++)//0 //11 //12 
				{
					System.out.print(ch); //AAAAAAAAAAA //BBBBBBBBBBBB
				}
				num=0;
				ch=c[i]; //A //B //C
			}
		}
	}
	void multipleChar()
	{
		System.out.println();
		String s="abc10bcd8";
		char[] c=s.toCharArray();
		int num=0;
		String s1="";
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLetter(c[i]))
			{
				s1=s1+c[i];
			}
			else if(Character.isDigit(c[i]))
			{
				num=num*10+Character.getNumericValue(c[i]);
				if(i==c.length-1)
				{
					for(int j=0;j<num;j++)
					{
						System.out.print(s1);
					}
				}
				else if(Character.isLetter(c[i+1]))
				{
					while(num>0)
					{
						System.out.print(s1);
						num--;
					}
					s1="";					
				}
			}
		}
	}
}