class Main
{ 	
	public static void main(String args[])
	{
		Armstrong armstrong=new Armstrong();
		armstrong.num=153;
		armstrong.copy1=armstrong.num;
		armstrong.copy2=armstrong.num;
		armstrong.countDigits();
		armstrong.sumDigits();
		armstrong.isArmstrong();
	}
}
class Armstrong
{
	int num,count,sum,copy1,copy2;
	void countDigits()
	{
		while(num!=0)
		{
			count++;
			num/=10;
		}
	}
	void sumDigits()
	{
		while(copy1!=0)
		{
			sum=sum+(int)(Math.pow(copy1%10,count));
			copy1/=10;
		}
	}
	void isArmstrong()
	{
		System.out.println(sum==copy2?"Armstrong "+sum:"Not Armstrong "+sum);
	}
}


