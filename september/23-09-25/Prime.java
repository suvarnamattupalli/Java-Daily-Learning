class Main
{ 	
	public static void main(String args[])
	{
		Prime prime=new Prime();
		prime.num=2;
		prime.checkFactors();
		prime.isPrime();
	}
}
class Prime
{
	int num,count;
	void checkFactors()
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				count++;
				break;
			}
		}
	}
	void isPrime()
	{
		System.out.println(count>=1?"Not Prime "+num : "Prime "+num);		
	}		
}


