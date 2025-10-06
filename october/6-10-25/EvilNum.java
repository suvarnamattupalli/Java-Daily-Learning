import java.util.Scanner;
class EvilNum
{ 	
	int squareOf(int num)
	{
		return num*num;
	}
	int addOf(int sq)
	{
		int add=0;
		while(sq!=0)
		{
			add=add+(sq%10);
			sq/=10;	
		}
		return add;
	}
	String checkEvil(int num,int add)
	{
		return num==add?"Evil":"Not Evil";
	}
	public static void main(String a[])
	{
		EvilNum e=new EvilNum();
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num:");
		int num=sc.nextInt();
		int sq=e.squareOf(num);
		int add=e.addOf(sq);
		System.out.println(e.checkEvil(num,add));//1 //9
	}
}
