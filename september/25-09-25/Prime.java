class Prime
{
	int factors;
	int countFactors(int num)
	{
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				factors++;
				break;
			}
		}
		return factors;
	}
	void isPrime(int result)
	{
		System.out.println(result==0?"Prime":"Not Prime");
		
	}
	public static void main(String args[])
	{
		Prime p=new Prime();
		int result=p.countFactors(11);
		p.isPrime(result);
	}
}