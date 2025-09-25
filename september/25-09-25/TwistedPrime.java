import java.util.Scanner;
class TwistedPrime
{
	int factors,temp,rev,x;
	String prim;

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

	String isPrime(int result_p)
	{
		String res=(result_p==0?"Prime":"Not Prime");
		return res;		
	}

	int reverse(int num)
	{
		while(num!=0)
		{
			rev=rev*10+(num%10);
			num/=10;
		}
		return rev;
	}

	void isTwisted(int result_tp)
	{
		System.out.print(result_tp==0?"Twisted Prime":"Not Twisted Prime");
	}

	void ifPrime()
	{
		if(prim=="Prime")
		{
			int rr=reverse(x);			//reverse the prime
			int result_tp=countFactors(rr);		//count factors
			isTwisted(result_tp);			//twistedPrime/not
		}
	
	}

	public static void main(String args[])
	{
		TwistedPrime tp=new TwistedPrime();	//Object of class	

		Scanner sc=new Scanner(System.in);	//input
		System.out.print("Enter a Number: ");
		tp.x=sc.nextInt();

		int result_p=tp.countFactors(tp.x);	//count factors
		tp.prim=tp.isPrime(result_p);		//prime or not

		System.out.println(tp.prim);		//printing prime/not
		tp.ifPrime();				//if prime checks twistedPrime
	}
}