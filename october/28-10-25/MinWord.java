class MinWord
{
	public static void main(String args[])
	{
		String s="Hello all good morning";
		String[] str=s.split(" ");
		String word="",s2="";
		int min=Integer.MAX_VALUE,count=0,x=0,i=0;
		for(i=0;i<str.length;i++)//0<4 //1<4
		{
			word=str[i]; //Hello all 
			if(word.length()<min)//5<6 //3<5
			{
				min=word.length();//5
				s2=word;
			}
		}
		System.out.print(s2+" "+min);
		
	}
}
//all 3