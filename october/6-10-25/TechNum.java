import java.util.Scanner;
class TechNum
{ 	
	
	int countDigit(int num)
	{
		int count=0; //dec and init as local varibale to reuse after return
		while(num!=0)
		{
			count++;
			num/=10;
		}
		return count;
	}
	int splitNum(int num,int count)
	{
		int n1=num/(int)Math.pow(10,count/2);
		int n2=num%(int)Math.pow(10,count/2);
		return n1+n2;
	}
	String checkTech(int num,int sum)
	{
		return sum*sum==num?"Technology Num":"Not Technology Num";
	}
	public static void main(String a[])
	{
		TechNum t=new TechNum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		int count=t.countDigit(num);
		int sum=t.splitNum(num,count);
		System.out.println(t.checkTech(num,sum));
	}
}
