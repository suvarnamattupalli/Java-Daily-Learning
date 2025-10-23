class MaxWord
{
	public static void main(String args[])
	{
		MaxWord m=new MaxWord();
		System.out.println("Multiple");
		m.multiple();
		System.out.println("First Occ");
		m.firstOcc();
		System.out.println("Last Occ");
		m.lastOcc();
	}
	void multiple()
	{
		String s1="hello all good morning evening";
		String str[]=s1.split(" ");
		int max=0;
		String max_word="";
		for(int x=0;x<str.length;x++) //0<5 //1<5 //2<5 //3<5 //4<5 //5<5F
		{
			String word=str[x]; // hello //all //good //morning //evening
			if(word.length()>=max) //5>=0 //3>=5F //4>=5F //7>=5 //7>=7
			{
				if(word.length()>max) //5>0  //7>5 //7>7
				{
					max=word.length(); //5 //7
					max_word=word+" "; //hello //morning
				}
				else //so to print multiple words...
				{
					max_word=max_word+word+" ";//hello //morning evening
				}
			}
		}
		System.out.println(max_word); //morning evening
	}
	void firstOcc()
	{
		String s1="hello all good morning evening";
		String str[]=s1.split(" ");
		int max=0;
		String max_word="";
		for(int x=0;x<str.length;x++) //0<5 //1<5 //2<5 //3<5 //4<5 //5<5F
		{
			String word=str[x]; // hello //all //good //morning //evening
			if(word.length()>max) //5>0 //3>5F //4>5F //7>5 //7>7F
			{
					max=word.length(); //5 //7
					max_word=word+" "; //hello //morning
			}
		}
		System.out.println(max_word); //morning
	}
	void lastOcc()
	{
		String s1="hello all good morning evening";
		String str[]=s1.split(" ");
		int max=0;
		String max_word="";
		for(int x=0;x<str.length;x++) //0<5 //1<5 //2<5 //3<5 //4<5 //5<5F
		{
			String word=str[x]; // hello //all //good //morning //evening
			if(word.length()>=max) //5>=0 //3>=5F //4>=5F //7>=5 //7>=7
			{
					max=word.length(); //5 //7 //7
					max_word=word+" "; //hello //morning //evening
			}
		}
		System.out.println(max_word); //evening
	}
}