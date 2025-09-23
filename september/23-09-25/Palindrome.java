class Main
{ 	
	public static void main(String args[])
	{
		Palindrome pal=new Palindrome();
		pal.num=121;
		pal.temp=pal.num;
		pal.reverse();
		pal.isPal();
	}
}
class Palindrome
{
	int num,rev,temp;
	void reverse()
	{
		while(num!=0)
		{
			rev=rev*10+num%10;
			num/=10;
		}
	}
	void isPal()
	{
		System.out.println(rev==temp?"Palindrome "+rev:"Not Palindrome "+rev);
	}	
}


