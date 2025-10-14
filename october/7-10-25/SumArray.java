import java.util.Scanner;
class SumArray
{
	public static void main(String a[])
	{
		int sum=0;

		Scanner sc=new Scanner(System.in);

		int[] arr=new int[5];
		System.out.print("Enter:");

		for(int x=0;x<=arr.length-1;x++)
			arr[x]=sc.nextInt();

		for(int x=0;x<=arr.length-1;x++)
		{
			//System.out.println(arr[x]);
			sum=sum+arr[x];
		}
		System.out.println(sum);
	}
}