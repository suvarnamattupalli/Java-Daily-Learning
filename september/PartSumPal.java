class PartSumPal
{
	public static void main(String args[])
	{
		int num=123456,count=0,part1=0,part2=0,temp=num,rem=0,sum=0,rev=0,s_temp=0;
		System.out.println("Given number "+num);
		while(num!=0)
		{
			count++;
			num/=10;	
		}
		part1=temp/(int)Math.pow(10,count/2);
		part2=temp%(int)Math.pow(10,count/2);
		System.out.println("Part1: "+part1+"\tPart2: "+part2);
		sum=part1+part2;
		s_temp=sum;
		System.out.println("Sum: "+sum);
		while(sum!=0)
		{
			rem=sum%10;
			rev=rev*10+rem;
			sum/=10;
		}
		System.out.println((s_temp==rev)?("Palindrome: "+rev):("Not a Palindrome: "+rev));
	}
}