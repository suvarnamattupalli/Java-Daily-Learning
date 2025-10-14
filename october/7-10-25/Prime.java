import java.util.Scanner;
class Prime
{
	public static void main(String a[])
	{
		int sum=0,count1=0;
		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		System.out.print("Enter:");

		for(int x=0;x<=arr.length-1;x++)
			arr[x]=sc.nextInt();

		System.out.print("Prime num in Array:");		

		for(int x=0;x<=arr.length-1;x++)
		{
			int count=0;
		 	for(int i=2;i<=arr[x]/2;i++)
			{
				if(arr[x]%i==0)
				{
				count++;
				}	
			}
			if(count==0)
			{
				count1++;
				sum+=arr[x];
				System.out.println(arr[x]);
			}	
		}
		System.out.println("Sum of Prime nums: "+sum);
		System.out.print("No of Primes: "+count1);
	}
}