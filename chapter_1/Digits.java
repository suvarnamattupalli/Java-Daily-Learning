class Digits
{
	public static void main(String args[])
	{
		int num=349;
		if(num>=0 && num<=9)
			System.out.println(num+" is Single Digit");
		else if(num>=10 && num<=99)
			System.out.println(num+" is Two Digit");
		else if(num>=100 && num<=999)
			System.out.println(num+" is Three Digit");
		else
			System.out.println("More than 3 digits");
	
	}
}